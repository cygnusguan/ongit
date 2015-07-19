package infra;

public class PlanSwitchChangeListener implements MyListener<PlanSwitchEvent>{

	@Override
	public void execute(PlanSwitchEvent e) {
		System.out.println("Wrong event...");
		e.callPlanSwitchEvent();

		
	}




}
