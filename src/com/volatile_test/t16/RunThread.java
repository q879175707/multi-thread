package com.volatile_test.t16;

public class RunThread extends Thread {
	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("into the run method");
		
		while(isRunning == true) {
			
		}
		
		System.out.println("thread is interrupted!");
	}
}
