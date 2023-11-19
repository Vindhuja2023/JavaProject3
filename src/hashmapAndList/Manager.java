package hashmapAndList;

public class Manager extends Employee{

	
	private int id;
	private String name;
	private String department;
	
	public Manager(int id, String name, String department) {
		super(id, name);
		
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}



}
