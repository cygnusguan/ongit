package infra;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import domain.BlacklistChangeEvent;
import domain.MyEvent;


public class BlackListEvent2 extends ApplicationEvent implements BlacklistChangeEvent {


    public BlackListEvent2(Object source) {
        super(source);

    }

	@Override
	public String getName() {
		return "Jack";
	}

	@Override
	public void setName(String name) {
	}

	@Override
	public List<String> getNewBacklist() {
		List<String> result = new ArrayList<String>();
		result.add(source.toString());
		return result;
	}

}