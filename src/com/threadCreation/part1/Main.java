package com.threadCreation.part1;

public class Main {

	public static void main(String argss[]) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run(){
				
				System.out.println("We are in thread "+Thread.currentThread().getName()+" which has started, which has priority "+Thread.currentThread().getPriority());
			
				throw new RuntimeException("Intentional Exception");
			}
			
		});
		thread.setName("Working new thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("A critical error occured "+t.getName()+" error is "+e.getMessage());
			}
		});
		System.out.println("We are in thread "+Thread.currentThread().getName()+" before starting the new thread");
		thread.start();
		System.out.println("We are in thread "+Thread.currentThread().getName()+" after starting the new thread");
		Thread.sleep(10000);
		}
	
}
