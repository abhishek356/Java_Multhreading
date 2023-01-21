package com.concurrency.ImplementingRunnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChildThread ch = new ChildThread();
		Thread MainThread = Thread.currentThread();
		MainThread.setPriority(2);
		MainThread.setName("MainThread");
		
		ch.t.start();
		
		for(int i = 0;i<10;i++) {
			
		try {	
		 MainThread.sleep(1000);
		  System.out.println("Inside MainThread "+i);
		}
		catch(InterruptedException ex) {
			System.out.println("Main Thread has been interrupted "+ex);
		}
			
		}
	}

}
