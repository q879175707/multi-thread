package com.syn.synchronized_method_lock_object;

public class MyObject {
	// synchronized ���벻�Ӷ����еĽ������Ҫ
	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
