package com.thread_communication.join.join_exception;

public class ThreadB extends Thread{
	@Override
	public void run() {
		super.run();
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();
			System.out.println("�߳�B��Run end����ӡ��");
		} catch (Exception e) {
			System.out.println("�߳�B��catch����ӡ��");
			e.printStackTrace();
		}
	}
}
