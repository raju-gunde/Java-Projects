package multitredding_demos;
class raju implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
   

	
}   
public class Java01 {
	public static void main(String[] args) 
	{
		raju r1 =new raju();
	    Thread t=new Thread(r1);
	    t.start();
		
	}

}
