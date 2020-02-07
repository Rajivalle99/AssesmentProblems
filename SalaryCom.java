package Assesment;

import java.util.Comparator;

public class SalaryCom implements Comparator<Employee>

{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.salary==o2.salary)
			return 0;
		if(o1.salary>=o2.salary)
			return 1;
		return -1;
	}

}
