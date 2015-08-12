package test;

import org.junit.BeforeClass;
import org.junit.Test;

import bean.TBean;
import bean.Target;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class Test1 {
	@Mocked  TBean bean;


    private Target target = new Target();
    
    @BeforeClass
    public static void befor(){
    	
    }
    

    @Test
    public void test1(){
		
		new Expectations() {
			{
			    bean.getName();returns("A","B");
			    //times=4;
			    bean.getId();returns("1","2","3","4",null);
			    //			    times=2;
			    
			   
			}
		};

		target.test1();
		target.test1();
		target.test1();
		new Verifications(){
		    {
			System.out.println("Verification:" + bean.getId());
		    }
		};

		
	}

}
