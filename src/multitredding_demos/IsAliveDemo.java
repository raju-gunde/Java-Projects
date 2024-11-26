package multitredding_demos;
class foo extends Thread{
	@Override
	public void run()
	{
		System.out.println("Child Thread is running with separate stack");
	}
}

public class IsAliveDemo {

	public static void main(String[] args) {
		foo f=new foo();
		System.out.println("therad is before start:"+f.isAlive());
        f.start();
        System.out.println("therad is after start:"+f.isAlive());
      //  System.out.println(10/0);
        //f.start(); java.lang.IllegalThreadStateException
	}

}
