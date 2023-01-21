package com.concurrency.ExtendingThread;

public class ChildThread extends Thread{

	
	
	
	
	
	ChildThread(){
		super("ChildThread");
		System.out.println("The childThread is "+this);
	}
	
	public void run() {
		
	Thread t = Thread.currentThread();
		
			
				
				try {
					
					for(int j = 0 ; j< 10;j++) {
						
						Thread.sleep(500);
						System.out.println("Inside Child Thread "+t.getName());
					
				}
				}
				catch(InterruptedException ex) {
				
					System.out.println("Exception Thrown "+ex);
					
				}
				
			
			
		
		
	}
}
