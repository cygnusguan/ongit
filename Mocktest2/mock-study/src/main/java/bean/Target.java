package bean;



public class Target {
	
	private int a,b,c;

	
	

    public int getA() {
		return a;
	}




	public void setA(int a) {
		this.a = a;
	}
	
	public TBean getTBean(){
		TBean b = new TBean();
		b.setId("Bean ID");
		b.setName("bean name");
		return b;
	}




	public int getB() {
		return b;
	}




	public void setB(int b) {
		this.b = b;
	}




	public int getC() {
		
		return a+b;
	}




	public void setC(int c) {
		this.c = c;
	}
	
	public void log(String show){
		System.out.println(show);
	}



	public Target(){
		System.out.println("Init target....");
	}

	public void test1(){
	TBean bean = new TBean();
	String name = bean.getName();
	String id = bean.getId();

	System.out.println("Bean name + id :" + name + "|" + id);


	if (id == null){
	    //throw new RuntimeException("id is null!!");
	    System.out.println("ID is null");
	}

    }
}
