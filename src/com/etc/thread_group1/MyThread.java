package com.etc.thread_group1;

public class MyThread extends Thread {
	private String num;
	public MyThread(ThreadGroup group, String name, String num) {
		super(group,name);
		this.num = num;
	}
	
	@Override
	public void run() {
		int numInt = Integer.parseInt(num);
		while(true) {
			System.out.println("À¿—≠ª∑÷–£∫" + Thread.currentThread().getName());
		}
	}
}
