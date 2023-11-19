package collections;

public class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void issuePayCheck() {
		System.out.println("Paycheque is issue to  " + name + " with id " + id);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
