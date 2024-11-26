package multitreadddemo_02;
class Test implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println(name+"is"+i);
			
			if(name.equals("child1")) {
				Thread.yield();
			}
		}
		
	}
	
}

public class ThreadYieldMethod {
public static void main(String[] args) throws InterruptedException {
	Test t1=new Test();
	Thread thread1=new Thread(t1,"child1");
	Thread thread2=new Thread(t1,"child2");
	thread1.start();
	
	thread1.join();
	thread2.start();
	
	
}
}
