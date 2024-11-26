package multitredding_demos;
class treaddemo implements Runnable{

	@Override
	public void run() {
		String name=null;
		
		for(int i=0;i<5;i++) {
			name=Thread.currentThread().getName();
			
			System.out.println(name+" "+i);
		}
		
	}
	
	
}

public class demo01 {
	public static void main(String[] args) {
		
		treaddemo t1=new treaddemo();
		Thread t2=new Thread(t1,"raju");
		
		Thread t3=new Thread(t1,"arjun");
		t2.start();
		t3.start();
	}

}
