package com.lock.reentrant_lock.lock_method.lock_method_test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			lock.lock();
			System.out.println("threadName=" + Thread.currentThread().getName() + "进入了wait");
			condition.await();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("有" + lock.getWaitQueueLength(condition) 
			+ "个线程正在等待condition");
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
