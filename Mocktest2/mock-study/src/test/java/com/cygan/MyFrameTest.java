package com.cygan;


import java.util.ArrayList;
import static org.fest.assertions.Assertions.*;
import java.util.List;

import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JListFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyFrameTest {
	private FrameFixture frame; 

	
	  @Before 
	  public void setUp() { 
	    frame = new FrameFixture(new MyFrame()); 
	    frame.show(); // 将frame显示出来 
	  }
	  
	  @Test 
	  public void testCopyTextToLabel() { 
	    frame.textBox("input").enterText("Hello World!"); 
	    frame.button("copy").click(); 
	    frame.label("show").requireText("Hello World!"); 

	    frame.comboBox("list").selectItem("B").requireSelection("B");

	    List<String> l = new ArrayList<String>();
	    assertThat(l).hasSize(0);
	    
	    
	  }
	  
	  @After 
	  public void tearDown() { 
	    frame.cleanUp(); 
	  }
	  
	  public  void startFest() {
		MyFrameTest t = new MyFrameTest();
		t.setUp();
		t.testCopyTextToLabel();
		//t.tearDown();
	}

}
