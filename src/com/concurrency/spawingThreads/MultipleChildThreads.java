package com.concurrency.spawingThreads;

public class MultipleChildThreads implements Runnable{

	
	
	
	
	private String ThreadName;
	Thread t;
	MultipleChildThreads(String ThreadName){
		this.ThreadName = ThreadName;
		
		t = new Thread(this,this.ThreadName);
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <10;i++) {
			
			try {
				
				System.out.println("Thread running : "+t.getName());
				Thread.sleep(500);
				
			}
			
			catch (InterruptedException ex) {
				System.out.println("Exception occured "+ex);
			}
			
		}
		System.out.println("Exiting current Thread : "+t.getName());
		
	}
	


}
