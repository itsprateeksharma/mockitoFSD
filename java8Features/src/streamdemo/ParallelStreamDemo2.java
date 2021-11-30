package streamdemo;

import java.util.ArrayList;
import java.util.List;

//java program to count Employees whose salary is greater than 15000 in quick fashion
public class ParallelStreamDemo2 {

	public static void main(String[] args) {
		
		List < Employee > empList = new ArrayList < Employee > ();
		for (int i = 0; i < 100; i++) {
		empList.add(new Employee("Allen", 20000));
		empList.add(new Employee("Boon", 3000));
		empList.add(new Employee("Cavin", 15002));
		empList.add(new Employee("Duke", 7856));
		empList.add(new Employee("Eon", 200));
		empList.add(new Employee("Fred", 50000));
		}
		
		empList.stream().forEach(i->System.out.println(i.getName()+" "+i.getSalary()));
		
		long t1=System.currentTimeMillis();
		System.out.println("Count of Employees Using Sequential Stream: "+empList.stream().filter(e->e.getSalary()>15000).count());
		
		long t2=System.currentTimeMillis();
		System.out.println("Time taken by SequentialStream to count employees: +"+(t2-t1));
		
		System.out.println("___________________________________");
		
		long t3=System.currentTimeMillis();
		System.out.println("Count of Employees using Parallel Stream: "+empList.stream().parallel().filter(e->e.getSalary()>15000).count());
		
		
		long t4=System.currentTimeMillis();
		System.out.println("Time taken by parallel stream to count employees: +" +(t4-t3));
	}

}
