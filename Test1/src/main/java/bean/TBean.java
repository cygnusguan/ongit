package bean;

public class TBean {
	private String name;
	private String id;
	
	public TBean(){
		System.out.println("Init Tbean...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
