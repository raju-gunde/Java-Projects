package multitredding_demos;

public class Java8 extends Thread {
	public static void main(String[] args) 
	{
		Java8 java3 = new Java8();
		 Thread t=new Thread(java3);
	   
	    t.setDaemon(true);
	    System.out.println(t.currentThread());
	    if(t.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread Running");
		}
		else
			System.out.println("Normal Thread Running");
		
		Java8 java = new Java8();
		Java8 java1 = new Java8(); //setDaemon
		Java8 java2 = new Java8();
		
		
		java1.setDaemon(true);
		
		java.start();
		java1.start();
		java2.start();
		java3.start();
		
    }
}
