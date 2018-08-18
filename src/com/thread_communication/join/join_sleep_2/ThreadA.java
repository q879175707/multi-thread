package com.thread_communication.join.join_sleep_2;

public class ThreadA extends Thread{
	
	private ThreadB b;
	
	public ThreadA(ThreadB b) {
		this.b = b;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			synchronized (b) {
				b.start();
				b.join(); // ˵��join�ͷ����ˣ�
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					String newString = new String();
					Math.random();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
