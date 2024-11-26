package streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectrotsDemo2 {

	record Employee(Integer empId, String empName, double salary, Department dept) {

	}

	record Department(Integer deptId, String deptName) {
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "A", 23789.89, new Department(1, "IT"));
		Employee e2 = new Employee(222, "B", 23789.89, new Department(1, "IT"));
		Employee e3 = new Employee(333, "C", 23789.89, new Department(2, "Sales"));
		Employee e4 = new Employee(444, "D", 23789.89, new Department(2, "Sales"));

		List<Employee> list = List.of(e1, e2, e3, e4);
		// System.out.println(list);
		Map<Department, List<Employee>> mm = list.stream().collect(Collectors.groupingBy(Employee::dept));
System.out.println(list);
		mm.forEach((key, value) -> {
			System.out.println(key + ":" + value);

		});

	}

}
