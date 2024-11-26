package multitredding_demos;

class Test1 extends Thread {
	int var = 0;

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			var+=i;

		}
		System.out.println("sending notification");

	}

}

public class InterThreadComm {
	public static void main(String[] args) {
		Test1 ts=new Test1();
		ts.start();
		synchronized (ts) {
			try{
				System.out.println("massage is weaiting..");
			

			ts.wait();
			System.out.println("maini method is wake up");
			}
		
		catch(InterruptedException e)
		{
		}
		System.out.println("Value is: " + ts.var);
		}	
	}

}
