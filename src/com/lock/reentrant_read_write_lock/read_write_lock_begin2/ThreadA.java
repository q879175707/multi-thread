package com.lock.reentrant_read_write_lock.read_write_lock_begin2;

public class ThreadA extends Thread{
	
	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.read();
	}
}
