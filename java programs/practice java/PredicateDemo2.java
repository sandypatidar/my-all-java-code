import java.util.function.*;
import java.util.*;
class Employee {
	String name;
	double salary;
	public Employee(String name, double salary){
		this.name = name;
		this.salary=salary;
	}
}
class PredicateDemo2 {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("durga",1000));
		l.add(new Employee("Ravi",2000));
		l.add(new Employee("shiva",3000));
		l.add(new Employee("adarsh",4000));
		l.add(new Employee("sagar",5000));
		l.add(new Employee("sunil",6000));
		l.add(new Employee("atul",7000));

		Predicate<Employee> p = x -> x.salary>3000;
		for (Employee e1:l) {
			if(p.test(e1)){
				System.out.println(e1.name+":"+e1.salary);
			}
		}
	}
}