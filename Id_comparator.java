package Assesment;

import java.util.Comparator;

public class Id_comparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.id==o2.id)
			return 0;
		if(o1.id>o2.id)
			return 1;
		return -1;
	}

}
