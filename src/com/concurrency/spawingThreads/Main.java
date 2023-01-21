package com.concurrency.spawingThreads;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MultipleChildThreads childOne = new MultipleChildThreads("ChildOne");
		MultipleChildThreads childTwo = new MultipleChildThreads("ChildTwo");
		MultipleChildThreads childThree = new MultipleChildThreads("ChildThree");
		
		childOne.t.start();
		childTwo.t.start();
		childThree.t.start();
		
		Thread MainThread = Thread.currentThread();
		
		//System.out.println(MainThread.getName());
	//	for(int i=0;i<10;i++)
		
			try {
				Thread.sleep(10000);
				System.out.println("Main Thread executing : "+MainThread.getName());
			}
			catch(InterruptedException ex) {
				
				System.out.println("Exception Occurred : "+ex);
				
			}
			
			
		
		System.out.println("Exiting main thread : "+MainThread.getName());
	}

}
