package infra;

import java.util.List;

public interface P2LEvent<L extends MyListener> {
	
	public List<L> findAllLInRegister(Class<L> cl);

}
