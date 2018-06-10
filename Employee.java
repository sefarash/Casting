package employee;
public abstract class Employee {
	
	String name;
	int Id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}
	
	abstract void getPaid();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Id=" + Id + "]";
	}
	
	public final void displayEmployeePolicy() {
		System.out.println("Employee policy is...");
	}
	
	public static void showEmployeeManual() {
		System.out.println("Employee manual is...");
	}
}
