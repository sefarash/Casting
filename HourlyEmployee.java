package employee;
public class HourlyEmployee extends Employee {
	
	int wage;
	int hours;

	public HourlyEmployee(String name, int id,int wage,int hours) {
		super(name, id);
		this.wage = wage;
		this.hours = hours;
		// TODO Auto-generated constructor stub
	}

	public double getWage() {
		return wage;
	}

	public int getHours() {
		return hours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", name=" + name + ", Id=" + Id + "]";
	}
	
	public int calculateYearlyWage() {
		return wage*hours*52;
		

	}

	@Override
	void getPaid() {
		System.out.println(this.calculateYearlyWage());
		
	}
	
	

}
