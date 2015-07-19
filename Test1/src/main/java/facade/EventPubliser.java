package facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import domain.MyEvent;

@Service
public class EventPubliser {
	@Autowired
	 private ApplicationEventPublisher publisher;
	
	public EventPubliser(){
		System.out.println("To debug");
	}

	public void publishEvent(MyEvent e) {
		if (e instanceof ApplicationEvent){
			publisher.publishEvent((ApplicationEvent)e);
		} else {
			throw new RuntimeException("The event implement class should extends ApplicationEvent");
		}
		
		
	}
}
