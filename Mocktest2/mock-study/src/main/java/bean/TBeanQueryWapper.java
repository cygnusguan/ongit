package bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TBeanQueryWapper {
	
	private List<TBean> beans;

	public TBeanQueryWapper(List<TBean> beans){
		this.beans = beans;
	}
	
	
	public List<Object> getQueryList(){
		if (beans == null){
			return null;
		}
		List<Object> r = new ArrayList<Object>();
		for (TBean bean : beans){
			List<Object> row = new ArrayList<Object>();
			row.add(Arrays.asList("id",bean.getId()));
			row.add(Arrays.asList("name",bean.getName()));
			r.add(row);
			
		}
		return r;
	}
	

}
