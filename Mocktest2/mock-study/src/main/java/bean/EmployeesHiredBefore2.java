package bean;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeesHiredBefore2 {
  private Date date;


  public EmployeesHiredBefore2(String date) {
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	  
	    try {
			this.date = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	  }

  public void table(List<List<String>> table) {
    //optional function
  }

  public List<Object> query() {

    return
      list(
        list(
          list("employee number", "1429"),
          list("first name", "Bob"),
          list("last name", "Martin"),
          list("hire date", "10-Oct-1974")
        ),
        list(
          list("employee number", "8832"),
          list("first name", "James"),
          list("last name", "Grenning"),
          list("hire date", "15-Dec-1979")
        )
      );
  }

private List<Object> list(Object... s) {
	List r = new ArrayList();
	for (Object o : s){
		r.add(o);
	}
	
	return r;
}
} 