package com.thread_communication.notify_one;

public class NotifyTread extends Thread{
	private Object lock;
	public NotifyTread(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		synchronized (lock) {
			lock.notifyAll();
		}
	}
	
}
