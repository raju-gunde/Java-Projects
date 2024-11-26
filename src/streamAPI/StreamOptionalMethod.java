package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOptionalMethod {
	record Employee(Integer age, String name) {

	}
	record Employees(Integer employeeId, String employeeName, Double employeeSalary)
	{
		
	}

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 4, 2, 6, 8);
		Optional<Integer> o = l1.stream().min(Integer::compareTo);
		o.ifPresent(p -> System.out.println("minimum .."+p));
		Optional<Integer> o1=l1.stream().max(Integer::compareTo);
		o1.ifPresent(p ->System.out.println("max is:"+p));
 		
		
		Employee e1 = new Employee(23, "Scott");
		Employee e2 = new Employee(19, "Smith");
		Employee e3 = new Employee(12, "John");
		Stream<Employee> emp=Stream.of(e1,e2,e3);
		Optional<Employee> op=emp.min(Comparator.comparingInt(Employee::age));
		if(op.isPresent()) {
			System.out.println("minimum employee data based on min age..."+op.get());
		}
		else {
			System.out.println("then there is no datata");
		}
		Employees el1 = new Employees(111, "Aman", 23000D);
		Employees el2= new Employees(222, "Ramesh", 24000D);
		Employees el3 = new Employees(333, "Suraj", 25000D);
		Employees el4 = new Employees(444, "Raj", 26000D);
		
		
		List<Employees> listOfEmployees = List.of(el1,el2,el3,el4);

		Optional<Employees> max = listOfEmployees.stream().max(Comparator.comparingDouble(Employees::employeeSalary));
		
		System.out.println("Employee with maximum Salary is :");
		max.ifPresent(System.out::println);
		
		
	}

}
