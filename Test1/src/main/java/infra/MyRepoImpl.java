package infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.MyEntity;
import domain.MyRepo;


@Repository
public class MyRepoImpl implements MyRepo{
	
	
	private MyDelegate delegate;

	@Autowired
	public MyRepoImpl(MyDelegate d) {
		this.delegate = d;
	}

	@Override
	public void save(MyEntity entity) {
		delegate.save(entity);
		
	}

	@Override
	public void triggeredByListener() {
		System.out.println("Good! triggered by listener!!");
		
	}

}
