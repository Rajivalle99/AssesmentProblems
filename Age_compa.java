package Assesment;
import java.util.Comparator;

public class Age_compa implements Comparator<Employee>

{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
			return 0;
		if(o1.age>=o2.age)
			return 1;
		return -1;
	}

	
}
