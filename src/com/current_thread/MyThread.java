package com.current_thread;

public class MyThread  extends Thread{
	public MyThread() {
		System.out.println("构造方法的打印：" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		super.run();
		System.out.println("run方法的打印：" + Thread.currentThread().getName());
	}
	
}
