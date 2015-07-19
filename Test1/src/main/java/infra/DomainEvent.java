package infra;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import domain.MyEvent;

@Component
@Scope("prototype")
public class DomainEvent extends ApplicationEvent implements MyEvent{
	private long id = (int)(Math.random()*1000);
	private String name;


	public DomainEvent() {
		super("");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return String.format("DomainEvent: %s %d", this.name,id);
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

}
