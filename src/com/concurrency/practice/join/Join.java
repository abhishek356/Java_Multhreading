package com.concurrency.practice.join;

public class Join implements Runnable{

	
	
	
	private String name;
	Thread t;
	
	Join(String name){
	
	this.name = name;
	t = new Thread(this,this.name);
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Started : "+t.getName());
		for(int i =0;i<5;i++) {
			
			try {
			Thread.sleep(1000);
			System.out.println("Current Thread is executing : "+t.getName()+" : "+i);
			}
			catch(InterruptedException ex) {
				
				System.out.println("Exception Occured : "+ex);
				
			}
			//System.out.println("Current Thread is executing : "+t.getName());
		}
		
		System.out.println("Exiting Thread : "+t.getName());
		
	}

	
	
	
}
