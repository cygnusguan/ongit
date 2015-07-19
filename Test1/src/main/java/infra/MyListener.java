package infra;


public interface MyListener<E extends AbstractEvent> {
	<L extends MyListener<E>> void execute(E e);
}
