package com.syn.synchronized_method_lock_object;

public class MyObject {
	// synchronized 加与不加对运行的结果很重要
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
