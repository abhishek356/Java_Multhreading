package com.concurrency.practice;

public class MainThread {

	
	
	//Controlling the main thread.
	
	public static void main(String args[]) {
		
		Thread t = new Thread();
		
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		t.setName("MainThread");
		
		t.setPriority(3);
		
		try {
			
			for(int i =0;i<10;i++)
			{
				System.out.println("countdown "+i);
				t.sleep(1000);
			}
		}catch(InterruptedException ex)
		{
			System.out.println("Thread has been interrrupt"+ex);
		}
		
		finally{
	
			System.out.println(t);
	}
}
}
