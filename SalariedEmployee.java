package employee;
public class SalariedEmployee extends Employee{
	int salary;
	
	public SalariedEmployee(String name, int id,int salary) {
		super(name, id);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		
		return salary;
	}



	@Override
	public void getPaid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", name=" + name + ", Id=" + Id + "]";
	}
	
	 int calculateYearlySalary() {
		    return salary * 12;
		  }

}
