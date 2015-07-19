package facade;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import infra.BlackListEvent2;
import infra.DomainEvent;
import infra.DomainEvent2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import domain.MyEntity;
import domain.MyEvent;
import domain.MyRepo;

@Service
public class MyFacade {
	@Autowired
	EventPubliser publisher;
	 
	@Autowired
	AnnotationConfigApplicationContext ctx;
	
	@Autowired SimpleApplicationEventMulticaster caster;
	
	@Autowired
	MyRepo repo;

	public void setRepo(MyRepo repo){
		this.repo =repo;
	}
	
	public void exeuteLogic(){

		MyEntity entity = new MyEntity(repo);
		entity.setId(1111);
		entity.setName("Jack");
		entity.executeLogc();
		//MyEvent e = new DomainEvent(this);
		
		
		SimpleAsyncTaskExecutor exe2 =  new SimpleAsyncTaskExecutor();
		Executor exe = Executors.newFixedThreadPool(2);
		caster.setTaskExecutor(exe);
		
		publisher.publishEvent(createMyEvent("A"));
		publisher.publishEvent(createMyEvent("B"));
		publisher.publishEvent(createMyEvent("C"));
		
		
		
		BlackListEvent2 e = new BlackListEvent2("BlackListEvent2");
		
		//
		ApplicationListener<DomainEvent>  ae = new ApplicationListener<DomainEvent>() {

			@Override
			public void onApplicationEvent(DomainEvent event) {
				System.out.println("Annonaouse");
			}
		};

		
		//ctx.registerBeanDefinition("Annonaouse", ae);
		BeanDefinitionRegistry beanDefinitionRegistry = ctx.getDefaultListableBeanFactory();
		  // get the BeanDefinitionBuilder
        BeanDefinitionBuilder beanDefinitionBuilder = 
        BeanDefinitionBuilder.genericBeanDefinition(ae.getClass().getName());  
        // get the BeanDefinition
        BeanDefinition beanDefinition=beanDefinitionBuilder.getBeanDefinition();
        // register the bean
        beanDefinitionRegistry.registerBeanDefinition("ApplicationListener<DomainEvent>",beanDefinition);  
		
		
		publisher.publishEvent(e);
		System.out.println("!!!!Thread is :" + Thread.currentThread().getId());

	}


	public MyEvent createMyEvent(String name){
		MyEvent e =  ctx.getBean(MyEvent.class);
		e.setName(name);
		
		return e;
	}

	public void testMehtod() {
		System.out.println("Invoked by Listener1");
		
	}

}

@Lazy
@Component
class Listener1 implements ApplicationListener<DomainEvent> {
	@Autowired
	MyRepo repo;
	
	@Autowired
	MyFacade facade;

	@Override
	public void onApplicationEvent(DomainEvent event) {
		System.out.println("event get name is :" + event.getName());
		System.out.println("Thread is :" + Thread.currentThread().getId());
		facade.testMehtod();
		//repo.triggeredByListener();
	}
	
};


class BlacklisListerner implements ApplicationListener<BlackListEvent2> {
	@Autowired
	MyRepo repo;

	@Override
	public void onApplicationEvent(BlackListEvent2 event) {
		System.out.println("BlackListEvent2  :" + event.getNewBacklist());
	}
	
};


class Listener2 implements ApplicationListener<DomainEvent2> {
	@Autowired
	MyRepo repo;

	@Override
	public void onApplicationEvent(DomainEvent2 event) {
		System.out.println("Evnet2 is :" + event);
		repo.triggeredByListener();
	}
	
};


