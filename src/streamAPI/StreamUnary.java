package streamAPI;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class StreamUnary {

	record Employee(String name, int experience) {

	}

	public static void main(String[] args) {
		// using unary oparator...
		UnaryOperator<Integer> u1 = x -> x * x;
		System.out.println("unary oparator..." + u1.apply(2));
		// using bynary oparator...
		BinaryOperator<Integer> b1 = (x, y) -> x * y;
		System.out.println("using bynary oparatorrr.." + b1.apply(2, 4));

		// ToIntFunction method...
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee("Virat", 12));
		listOfEmployee.add(new Employee("Rohit", 12));
		listOfEmployee.add(new Employee("Bumrah", 6));
		listOfEmployee.add(new Employee("Akshar", 5));
		ToIntFunction<Employee> ef=emp ->emp.experience();
		int total=listOfEmployee.stream().mapToInt(ef).sum();
		System.out.println("ToIntFunction method is..."+total);
		//optional method class...
		
		
	}

}
