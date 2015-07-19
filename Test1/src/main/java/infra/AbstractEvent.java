package infra;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractEvent<L  extends MyListener> {

	public <E extends AbstractEvent<L>> void trigger(){
		List<MyListener<AbstractEvent<L>>> list = this.getListeners();
		
		if (list!=null){
			for (MyListener<AbstractEvent<L>> ll : list){
				ll.execute((E)this);
			}
		}

	}
	public List<MyListener<AbstractEvent<L>>> findAllLInRegister(Class<L> cl) {
		List<MyListener<AbstractEvent<L>>> result = new ArrayList<MyListener<AbstractEvent<L>>>();
		PlanChangeListener l = null;
//		
//		if (l != null && l.getClass() == cl){
//			result.add(l);
//		}
//			
		return result;
	}
	
	public List<MyListener<AbstractEvent<L>>> getListeners(){
		return null;
	}
}
