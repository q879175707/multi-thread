package com.etc.thread_exception_move;

public class MyThread extends Thread {
	private String num = "a";
	
	public MyThread() {
	}
	
	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	@Override
	public void run() {
		int numInt = Integer.parseInt(num);
		System.out.println("在线程中打印：" + (numInt + 1));
	}
}
