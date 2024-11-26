package multitreadddemo_02;
class SecondThread extends Thread{
	int x=0;
	public void run() {
		synchronized (this) 
		{
			for(int i=0;i<10;i++) {
				x=x+i;
			}
			System.out.println("Sending notification");
			System.out.println("value is:"+x);
			notify(); 
			
		}
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		SecondThread s1=new SecondThread();
		s1.start();
            synchronized (s1) {
            	try {
            		System.out.println("waiting for b is complete");
            		s1.wait();
            		System.out.println("main thread will be wakeup");
            	}
            	catch(InterruptedException e) {
            		System.out.println(e);
            	}
            	
				
			}
	}

}
