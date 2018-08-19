package com.lock.reentrant_lock.lock_method2.test3;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock;
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("公平锁情况：" + lock.isFair());
		} finally {
			lock.unlock();
		}
	}
}
