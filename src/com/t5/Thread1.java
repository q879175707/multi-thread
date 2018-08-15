package com.t5;

public class Thread1 extends Thread{
	private Task task;
	
	public Thread1(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
}
