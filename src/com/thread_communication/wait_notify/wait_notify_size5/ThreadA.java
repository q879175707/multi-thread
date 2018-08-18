package com.thread_communication.wait_notify.wait_notify_size5;

public class ThreadA extends Thread{
	private Object lock;
	public ThreadA(Object lock) {
		this.lock = lock;
	}
	@Override
	public void run() {
		super.run();
		try {
			synchronized (lock) {
				if (MyList.size() != 5) {
					System.out.println("wait begin" + System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end" + System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}