package com.lock.reentrant_lock.use_condition_wait_notify_error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
