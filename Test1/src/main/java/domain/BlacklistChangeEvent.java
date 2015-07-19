package domain;

import java.util.List;

public interface BlacklistChangeEvent extends MyEvent {
	public List<String>  getNewBacklist();
}
