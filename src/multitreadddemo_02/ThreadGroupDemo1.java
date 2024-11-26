package multitreadddemo_02;
class Foo implements Runnable{
	@Override
	public synchronized void run() {
		String name=Thread.currentThread().getName();
		for(int i=1;i<3;i++) {
			System.out.println(i+" by "+name+ " thread");
		}
		
	}
}

public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("NIT threaed");
		Thread t1=new Thread(tg,new Foo(),"child 1");
		Thread t2=new Thread(tg,new Foo(),"child 2");
		Thread t3=new Thread(tg,new Foo(),"child 3");
		t1.start();t2.start();t3.start();
		System.out.println("thread group name:"+tg.getName());
		System.out.println("total active threads:"+tg.activeCount());

	}

}
