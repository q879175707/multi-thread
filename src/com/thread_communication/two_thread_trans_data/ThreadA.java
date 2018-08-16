package com.thread_communication.two_thread_trans_data;

public class ThreadA extends Thread{
	private MyList list;
	
	public ThreadA(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("����� " + (i + 1) + " ��Ԫ��");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
