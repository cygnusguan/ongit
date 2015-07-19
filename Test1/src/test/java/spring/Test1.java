package spring;

import infra.PlanChangeEvent;
import infra.PlanChangeListener;
import infra.PlanSwitchChangeListener;
import infra.PlanSwitchEvent;
import infra.spring.SpringConfig;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import delegate.MyDelegateImpl;
import domain.MyEntity;
import facade.MyFacade;

public class Test1 {
	public static class MockDelegate extends MockUp<MyDelegateImpl>{
		@Mock
		public void save(MyEntity entity){
			System.out.println("I am doing: save(MyEntity entity)");
		}
	}
	
	
	@Test
	public void testCustomizedListerAndEvent(){
		PlanChangeListener l = new PlanChangeListener();
		PlanSwitchChangeListener l2 = new PlanSwitchChangeListener();
		
		PlanChangeEvent e = new PlanChangeEvent();
		PlanSwitchEvent e2 = new PlanSwitchEvent();
		
		
//		e.trigger(l);
//		e2.trigger(l2);
	}
	
	public static void main(String[] args) {

		new MockDelegate();
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		MyFacade t = ctx.getBean(MyFacade.class);
		

		
		t.exeuteLogic();
		
		
		
		
		
		
	
	}

}
