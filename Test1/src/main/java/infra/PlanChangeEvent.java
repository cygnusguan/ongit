package infra;

public class PlanChangeEvent extends AbstractEvent{
	public void command(PlanChangeListener listener){
		listener.triggerByPlanChanged(this);
	}
}
