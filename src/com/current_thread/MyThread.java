package com.current_thread;

public class MyThread  extends Thread{
	public MyThread() {
		System.out.println("���췽���Ĵ�ӡ��" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		super.run();
		System.out.println("run�����Ĵ�ӡ��" + Thread.currentThread().getName());
	}
	
}
