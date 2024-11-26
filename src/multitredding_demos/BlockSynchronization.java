package multitredding_demos;
class Table01{
	public void table() {
		
		 String name = Thread.currentThread().getName();
		  System.out.println("Thread inside the method is :"+name);
		synchronized (this) {
			for(int i=1;i<10;i++) {
				System.out.println("i value is :"+i+" by :"+name);
			}
			System.out.println("---------------------------");
		}
	}
}
public class BlockSynchronization {
 public static void main(String[] args) {
	 Table01 b=new Table01();
	 Runnable r=()->b.table();
	 Thread t=new Thread(r,"rahul");
	 Thread t1=new Thread(r,"kohli");
	 t.start();
	 t1.start();
	
}
}
