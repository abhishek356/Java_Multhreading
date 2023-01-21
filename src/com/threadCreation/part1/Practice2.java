package com.threadCreation.part1;

public class Practice2 {

	
	public static void main(String args[]) {
		
		
		Thread thread = new newThread();
		thread.start();
	}
	
	private static class newThread extends Thread{
		
		@Override
		public void run(){
			
			this.setName("working thread 1");
			Thread.currentThread();
			System.out.println("We are running the thread "+this.getName() );
			
		}
	}
	
	private static class Vault{
		private int password;
		
		Vault(int password){
			this.password = password;
		}
		
		public boolean isCorrect(int guess) {
			
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				
			}
			return this.password == guess;
		}
		
	}
	
	private static abstract class HackerThread extends Thread{
		private Vault vault;
		
		HackerThread(Vault vault){
			this.vault = vault;
			this.setName(this.getClass().getSimpleName());
			this.setPriority(Thread.MAX_PRIORITY);
		}
		
		@Override
		public void start() {
			System.out.println("Starting Thread "+this.getName());
			super.start();
		}
	}
}
