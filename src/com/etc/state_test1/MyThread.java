package com.etc.state_test1;

public class MyThread extends Thread{
	public MyThread() {
		System.out.println("���췽���е�״̬��" + Thread.currentThread().getState());
	}
	@Override
	public void run() {
		super.run();
		System.out.println("Run�����е�״̬��" + Thread.currentThread().getState());
	}
}
