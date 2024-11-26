package multitredding_demos;

public class LambdaWithThreadWithoutReference {

	public static void main(String[] args) {
		Runnable r1=()->{
			String name=Thread.currentThread().getName();
			System.out.println(name+"is thread name ");
			
		};
	Thread t1=new Thread(r1);t1.start();
	}

}
