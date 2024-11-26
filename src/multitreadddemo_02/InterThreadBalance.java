package multitreadddemo_02;

class Customer
{  
     int balance = 10000;    

	public synchronized void withdraw(int amount)  //amount = 15000
	{  
		System.out.println("going to withdraw...");
		
		if(balance < amount)
			{  
				System.out.println("Less balance; waiting for deposit...");  
					try
					{
						wait(); //Thread will release the lock 
					}
					catch(Exception e){}  
			}  
		balance  = balance - amount;
		System.out.println("withdraw completed..."+balance+" is remaining balance"); 
	}    

	public synchronized void deposit(int amount)   
		{  
			System.out.println("going to deposit...");  
			balance = balance + amount;  
			System.out.println("Balance after deposit is :"+balance);
			System.out.println("deposit completed... ");  
			notify();  
		}  
}   

public class InterThreadBalance {
	public static void main(String[] args) {
		 Customer c = new Customer();    //lock is created here

			Thread son = new Thread()  
			{  
				@Override
				public void run()
				{
					c.withdraw(5000);
				}  
			};
			son.start(); 		

			Thread father = new Thread()
			{  
				public void run()
				{
					c.deposit(9000);
				}  
			};
			
			father.start();  
	}

}
