package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class TestSelenium{
	
	
	private HtmlUnitDriver s;

	
	@Before
	public void setUp(){

		
		 s = new HtmlUnitDriver();
		 
		
	
	}
	
	@Test
	public void test(){
		 s.get("http://www.baidu.com");
		 WebElement we = s.findElementById("ftCon");
		 System.out.println(we.getText());
		
		
	}
}