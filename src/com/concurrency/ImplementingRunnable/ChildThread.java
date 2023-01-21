package com.concurrency.ImplementingRunnable;

public class ChildThread implements Runnable{

	Thread t;
	ChildThread()
	{
		//below code creates a thread instance of current object and sets it's name to ChildThread.
		t = new Thread(this,"ChildThread");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.setName("ChildThread");
		t.setPriority(5);
		for(int i = 0;i<10;i++)
		{
		try {
			t.sleep(500);
		t.setPriority(5);
		System.out.println("Inside ChildThread "+i);
	}
		catch (InterruptedException ex) {
			System.out.println("Exception thrown "+ex);
		}
			
		}
	}
}
