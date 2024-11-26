package june_19;



import java.util.*;

public class Directory {
	ArrayList<Employee> emp=new ArrayList<>();
	
     public void addEmployee(Employee e) {
    	 emp.add(e);
     }
     public void displayAllEmployees() {
    	 System.out.println(emp);
     }
     public void updateEmployee(int index) {
    	 //emp.set(index, e);
    	 System.out.println("choose the option you want to option");
    	 System.out.println("1)name \n 2)salary \n 3)position"); 
    	 Scanner sc= new Scanner(System.in);
    	 int z=sc.nextInt();
    	 switch(z)
    	 {
    	 case 1: System.out.println("enter the name you want to set"); 
    	         emp.get(index).setName(sc.next());
    	         System.out.println("name succesfully updated");
    	         break;
    	 case 2: System.out.println("enter the salary you want to set"); 
         emp.get(index).setSalary(sc.nextInt());
         System.out.println("salary succesfully updated");
         break;
    	 case 3: System.out.println("enter the position you want to change");  
    	        emp.get(index).setPosition(sc.next());
    	        System.out.println("position succesfully updated");
    	        break;
    	 }
    	 System.out.println(emp);
    	 
     }
     public void deleteEmployee(int index) {
    	 emp.remove(index);
    	 System.out.println(emp);
     }
}
