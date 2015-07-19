package domain;

public class MyEntity {
	
	private int id;
	private String name;
	private MyRepo repo;
	
	public MyEntity(MyRepo repo){
		this.repo = repo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void executeLogc(){
		System.out.println(String.format("id is %s , name is %s",id,name));
		repo.save(this);
	}

	
	
}
