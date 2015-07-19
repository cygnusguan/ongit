package test;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;

import org.junit.Test;

import bean.TBean;

public class Test1 {

	
	
	@Test
	public void test1(final	@Mocked  TBean bean){
		
		new Expectations() {
			{
				onInstance(bean).getName();returns("a");

			}
		};
		
		System.out.println(bean.getName());
		
		TBean another = new TBean();
		
		
		
		System.out.println(another.getName());
		System.out.println(another.getName());

	}
	
	
	private String[] ss(){
		return new String[] {"A","B","C","D","E"};
		
		
	}

}
