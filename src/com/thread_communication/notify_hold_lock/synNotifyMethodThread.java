package com.thread_communication.notify_hold_lock;

public class synNotifyMethodThread extends Thread{
	private Object lock;
	public synNotifyMethodThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}
