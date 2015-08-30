package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryWrapper {

	private String[] columns;
	
	private List<Object> table = new ArrayList<Object>();

	public QueryWrapper(String... columns) {
		this.columns = columns;
	}
	
	public void addRow(Object ... cells){
		List<Object> r = new ArrayList<Object>();
		for (int i=0;i<cells.length;i++){
			r.add(Arrays.asList((Object)columns[i],cells[i]));
		}
		table.add(r);
	}

	public List<Object> query(){
		System.out.println(table);
		return table;
	}
}
