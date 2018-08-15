package com.t5;

public class Thread2 extends Thread{
	private Task task;
	
	public Thread2(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}
