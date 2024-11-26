package multitredding_demos;
class Table{
	
	public synchronized void printTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(number+"X"+i+" "+"="  +(i*number));
		}
		
	}
}

public class MethodLevelSynchronization {
	public static void main(String[] args) {
		Table t1=new Table();
		Runnable r1=()->{
			t1.printTable(2);
		};
		Runnable r2=()->{
			t1.printTable(3);
		};
		Thread t3 = new Thread(r1,"Child1"); 
		Thread t4 = new Thread(r2,"Child2"); 
		t3.start(); t4.start();			
		
	}

}
