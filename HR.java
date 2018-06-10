package employee;

import java.util.ArrayList;
import java.util.List;

public class HR {

	public static void main(String[] args) {
		
		List<Employee> all = new ArrayList<>();

		all.add(new SalariedEmployee("Jon Snow", 101, 10000));
		all.add(new HourlyEmployee("Ned Stark", 102, 10, 2080));
		all.add(new SalariedEmployee("Mad King", 103, 10000));
		all.add(new HourlyEmployee("Ayra Stark", 104, 100, 200));
		all.add(new SalariedEmployee("Hodor", 105, 1000));
		all.add(new SalariedEmployee("Daenery Rargaryen", 50, 200000));

		for (Employee each : all) {
			System.out.println(each); // each.toString()
			each.getPaid();

			if (each instanceof SalariedEmployee) {
				SalariedEmployee empS = (SalariedEmployee) each;
				empS.calculateYearlySalary();
			} else if (each instanceof HourlyEmployee) {
				HourlyEmployee he = (HourlyEmployee) each;
				he.calculateYearlyWage();
			}

		}
	}
}
