package Assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee implements Comparable<Employee>
{
	int id;
    String name;
    int salary;
    int age;
    public Employee(int id,String name,int salary,int age) 
    {
		// TODO Auto-generated constructor stub
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    	this.age=age;
    	
    }
    


	@Override  //tostring is for string representation of an object
	public String toString() {
		System.out.println();
		return  ("id=" + id + " name=" + name + " salary=" + salary + " age=" + age);
	}



	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);   
	}
	public static void main(String args[])
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(118,"Raji",100000,21));
		list.add(new Employee(23, "Jani", 23000,21));
		list.add(new Employee(30, "Ramana",30000,22));
		list.add(new Employee(4, "Soniya",250000,22));
		list.add(new Employee(50,"Madhesh",50000,22));
		
		Collections.sort(list);
		Iterator<Employee> itr=list.iterator();
		
		System.out.println("Employees order by name(:");
		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		Collections.sort(list,new Age_compa());
		Iterator<Employee> itr1=list.iterator();
		System.out.println("Employees order by age(:");
		while(itr1.hasNext())
		{	
			System.out.println(itr1.next());
		}
		
		System.out.println();
		Collections.sort(list,new Id_comparator());
		Iterator<Employee> itr2=list.iterator();
		System.out.println("Employees order by Id(:");
		while(itr2.hasNext())
		{	
			System.out.println(itr2.next());
		}
		System.out.println();
		
		Collections.sort(list,new SalaryCom());
		Iterator<Employee> itr3=list.iterator();
		System.out.println("Employees order by age(:");
		while(itr3.hasNext())
		{	
			System.out.println(itr3.next());
		}
		
		
	}
	
}


