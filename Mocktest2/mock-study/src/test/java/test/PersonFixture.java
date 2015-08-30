package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.TBean;
import bean.TBeanQueryWapper;

public class PersonFixture {
	List<TBean> beans = new ArrayList<TBean>();
	
	
	public List<List<String>> doTable(List<List<String>> table){
		return Arrays.asList(table.get(0),Arrays.asList("pass","ignore"),Arrays.asList("pass:good","fail:X-bad"));
	}
	
	public void addNameId(String name,String id){
		TBean b = new TBean();
		b.setId(id);
		b.setName(name);
		beans.add(b);
	}
	public List<Object> query(){
		TBeanQueryWapper w = new TBeanQueryWapper(beans);
		return w.getQueryList();
	}
	public PersonFixture getThis(){
		return this;
	}
	public String getId(){
		return "0001";
	}
}
