package com.lock.reentrant_read_write_lock.read_write_lock_begin3;

public class ThreadB extends Thread{
	
	private Service service;
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.write();
	}
}
