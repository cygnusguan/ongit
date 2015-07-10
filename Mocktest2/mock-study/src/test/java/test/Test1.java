package test;

import org.junit.Test;

import bean.TBean;
import mockit.Expectations;
import mockit.Mocked;

public class Test1 {
	@Mocked  TBean bean;

    @Test
    public void test1(){
		
		new Expectations() {
			{
			    bean.getName();returns("A","B","C","D");
			}
		};
		
		System.out.println(bean.getName());
		
		System.out.println(bean.getName());
		
	}

}
