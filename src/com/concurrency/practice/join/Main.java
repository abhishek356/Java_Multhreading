package com.concurrency.practice.join;

public class Main {

	
	
	public static void main(String args[]) {
		
		Join firstChild = new Join ("firstChild");
		Join secondChild = new Join ("secondChild");
		Join thirdChild = new Join ("thirdChild");
		
		firstChild.t.start();
		secondChild.t.start();
		thirdChild.t.start();
		
		System.out.println(firstChild.t.getName()+" is Alive or Not : "+ firstChild.t.isAlive());
		System.out.println(secondChild.t.getName()+" is Alive or Not : "+ secondChild.t.isAlive());
		System.out.println(thirdChild.t.getName()+" is Alive or NOt : "+ thirdChild.t.isAlive());
		
		Thread MainThread = Thread.currentThread();
		
		try {
			System.out.println("Waiting for the thread to finish :");
			
			firstChild.t.join();
			secondChild.t.join();
			thirdChild.t.join();
			
		}
		
		catch (InterruptedException ex) {
			System.out.println("Exception occured  ");
		}
		
		System.out.println("Thread is Alive or Not : "+ firstChild.t.isAlive());
		System.out.println("Thread is Alive or Not : "+ secondChild.t.isAlive());
		System.out.println("Thread is Alive or NOt : "+ thirdChild.t.isAlive());

		System.out.println("Exiting MainThread : "+MainThread.getName());
	}
}
