package multitreadddemo_02;
class resourse{
	public boolean flag=false;
	public synchronized void waitMethod() {
	
		while(!flag) {
			try {
				System.out.println(Thread.currentThread().getName());
			    wait();
			}
			  catch (InterruptedException e) 
			  {
	                e.printStackTrace();
	          }
			
		}
		System.out.println(Thread.currentThread().getName() + " thread completed!!");
	}
	 public synchronized void setMethod() 
		{
			System.out.println("notifyAll");
			this.flag = true;
	        System.out.println(Thread.currentThread().getName() + " has make flag value as a true");
	        notifyAll(); 
	    }
}

public class InterThreadNotifyAll {

	public static void main(String[] args) {
		resourse r=new resourse();
		Thread t1=new Thread(()->r.waitMethod(),"child  1");
		Thread t2=new Thread(()->r.waitMethod(),"child  2");
		Thread t3=new Thread(()->r.waitMethod(),"child  3");
		Thread setter=new Thread(()->r.setMethod(),"setter Method..");
		t1.start();
		t2.start();t3.start();
		 try 
			{
	            Thread.sleep(2000);
	        } 
			catch (InterruptedException e) 
			{
	            e.printStackTrace();
	        }


	        setter.start();
		
		
		

	}

}
