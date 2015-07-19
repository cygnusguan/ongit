package infra;

import java.util.List;

public class Event1 implements P2LEvent<PlanChangeListener> {

	@Override
	public List<PlanChangeListener> findAllLInRegister(Class<PlanChangeListener> cl) {
		Object o = new String();
		
		if (o.getClass() == cl){
			return null;
		}
			
			
		
		
		return null;
	}

}
