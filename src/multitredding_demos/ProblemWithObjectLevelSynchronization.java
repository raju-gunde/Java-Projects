package multitredding_demos;

class PrintTable {
	public  static synchronized void printtable(int n) {
		//if we don't put static keyword to the method 
		//we get seaqunse Order missing..
		System.out.println("raju");
		for (int i = 0; i <= 5; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
		System.out.println(".................................");

	}
}

public class ProblemWithObjectLevelSynchronization {
	public static void main(String[] args) {
		PrintTable pt = new PrintTable();
		PrintTable pt1 = new PrintTable();
		Runnable r1 = new Runnable()
		{

			@Override
			public void run() {
				pt.printtable(3);

			}
		};
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				pt.printtable(2);

			}
		};
		Thread t1 = new Thread(r1);

		Thread t2 = new Thread(r2);
		t1.start();t2.start();
		Runnable r3=new Runnable() {
			
			@Override
			public void run() {
				pt1.printtable(5);
				
			}
		};
		Runnable r4=new Runnable() {
			
			@Override
			public void run() {
				pt1.printtable(10);
				
			}
		};
		Thread t3=new Thread(r3);
		Thread t4=new Thread(r4);
		t3.start();t4.start();
		
	}

}
