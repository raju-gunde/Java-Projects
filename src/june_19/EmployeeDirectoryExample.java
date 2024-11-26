package june_19;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		Directory d=new Directory();

		Employee e = new Employee("srikar","devloper", 10000);
		Employee e1=new  Employee("Raaj", "Manager", 48000);
	Employee e2=new Employee("Ganesh", "Devoloper", 40000);
	Employee e3=new Employee("praveen", "Devoloper", 40000);
	
		d.addEmployee(e);
		d.addEmployee(e1);
		d.addEmployee(e2);
		d.addEmployee(e3);
		d.displayAllEmployees();
		d.updateEmployee(1);
		d.deleteEmployee(1);

	}

}
