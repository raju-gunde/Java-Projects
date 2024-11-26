package multitredding_demos;
class joins extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("int i value is:"+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class SleepDemo {
	public static void main(String[] args) {
		joins j=new joins();
		j.start();
	}

}
