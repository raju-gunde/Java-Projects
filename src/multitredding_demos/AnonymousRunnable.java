package multitredding_demos;

public class AnonymousRunnable {
	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				String name=Thread.currentThread().getName();
				System.out.println(name);
			}
		};
		Thread t2=new Thread(r1);
		t2.start();
		String name = Thread.currentThread().getName();
		System.out.println(name +" Thread is running Here");
		
	}

}
