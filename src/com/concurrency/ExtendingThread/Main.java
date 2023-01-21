package com.concurrency.ExtendingThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChildThread ch = new ChildThread();
		ch.start();
		
		Thread MainThread = Thread.currentThread();
		
		MainThread.setName("MainThread");
		
		for(int i = 0;i<10;i++)
		{
			try {
			Thread.sleep(1000);
			System.out.println("Inside Main Thread");
		}
		catch(InterruptedException ex)
			{
			
			System.out.println("Exception Thrown "+ex);
			
			}
			}
	}

}
