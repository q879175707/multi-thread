package com.lock.reentrant_lock.lock_method2.test4;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	private ReentrantLock lock;
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		try {
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		} finally {
			lock.unlock();
		}
	}
}
