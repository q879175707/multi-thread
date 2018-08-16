package com.thread_communication.notify_hold_lock;

public class NotifyThread extends Thread{
	private Object lock;
	public NotifyThread(Object lock) {
		this.lock = lock;
	}
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}
