package multitreadddemo_02;
class temp{
	
}

public class ThreadGroupDemo3 {
	public static void main(String[] args) {
		temp t1=new temp();
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
			  System.out.println("raju");
			}
			
		};
	
		Thread th1=new Thread(r1);
		Thread th2=new Thread(r1);
		th1.start();
		th2.start();
	    System.out.println(Thread.activeCount());
	}

}
