package delegate;

import org.springframework.stereotype.Component;

import domain.MyEntity;
import infra.MyDelegate;

@Component
public class MyDelegateImpl implements MyDelegate {

	@Override
	public void save(MyEntity entity) {
		throw new RuntimeException("COding...");

	}

}
