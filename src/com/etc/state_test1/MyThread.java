package com.etc.state_test1;

public class MyThread extends Thread{
	public MyThread() {
		System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
	}
	@Override
	public void run() {
		super.run();
		System.out.println("Run方法中的状态：" + Thread.currentThread().getState());
	}
}
