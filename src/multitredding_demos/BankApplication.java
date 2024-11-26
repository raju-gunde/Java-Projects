package multitredding_demos;

import java.util.concurrent.SynchronousQueue;

class Bank {
	int availablebalance=10000;
	int balance;
	public Bank(int balance) {
		super();
		this.balance = balance;
	}
	
}

public class BankApplication {
	public static void main(String[] args) {
		Bank n=new Bank(5000);
		Runnable r1=()->
		{
			
			String name=null;
			 if(n.availablebalance>=n.balance) 
				 {
			 name=Thread.currentThread().getName();
			System.out.println("Amont is withdraw by :"+name);
			n.availablebalance-=n.balance;
			}
			else {
				 name=Thread.currentThread().getName();
				 System.err.println(name +" u have insufficient balance");
			}
		};
		Thread t=new Thread(r1,"scott");
		
		Thread t1=new Thread(r1,"smith");
		t.start();t1.start();
	}

}
