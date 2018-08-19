package com.lock.reentrant_lock.lock_method2.test5;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	private ReentrantLock lock;
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		try {
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
		} finally {
			lock.unlock();
		}
	}
}
