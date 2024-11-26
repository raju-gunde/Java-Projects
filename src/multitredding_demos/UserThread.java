package multitredding_demos;
class Mythread extends Thread{
	@Override
	public void run() {
		System.out.println("child tread is running");
		String name=Thread.currentThread().getName();
		System.out.println("RUnning thread is:"+name);
	}
}

public class UserThread {

	public static void main(String[] args) {
		System.out.println("main thread is started");
		Mythread m=new Mythread();
		m.start();
		System.out.println("main thread is ended");
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running ");

	}

}
