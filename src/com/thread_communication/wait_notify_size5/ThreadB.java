package com.thread_communication.wait_notify_size5;

public class ThreadB extends Thread{
	private Object lock;
	public ThreadB(Object lock) {
		this.lock = lock;
	}
	@Override
	public void run() {
		super.run();
		try {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					MyList.add();
					if (MyList.size() == 5) {
						lock.notify();
						System.out.println("�ѷ���֪ͨ��");
					}
					System.out.println("����� " + (i + 1) + "��Ԫ�أ�");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
