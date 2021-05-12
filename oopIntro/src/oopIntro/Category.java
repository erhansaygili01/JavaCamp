package oopIntro;

public class Category {
	int id;
	String name;
	
	public Category() {
		System.out.println("Category constructoru çalıştı.");
	}
	
	public Category(int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

}
