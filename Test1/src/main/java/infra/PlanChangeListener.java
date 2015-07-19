package infra;

import java.util.List;

public class PlanChangeListener implements MyListener<PlanChangeEvent>{

	void triggerByPlanChanged(PlanChangeEvent planChangeEvent){
		
	}

	@Override
	public void execute(PlanChangeEvent e) {
		List< MyListener<AbstractEvent>> list = e.getListeners();
		e.command(this);
		System.out.println("public <E extends AbstractEvent<PlanChangeListener>> void execute(E e) ");
		
	}




}
