package june_11;
class Test implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println("i value is :"+i+" by thread :"+name);
			if(name.equals("child1")) {
				Thread.yield();
			}
		}
		
		
	}
	
}

public class ThreadYieldMethod {
public static void main(String[] args) {
	Test test=new Test();
	Thread t1=new Thread(test,"child1");
	Thread t2=new Thread(test,"child2");
	t1.start();t2.start();
}
}
