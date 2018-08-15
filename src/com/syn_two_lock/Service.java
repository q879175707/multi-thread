package com.syn_two_lock;

public class Service {
	synchronized public static void printA() {
		try {
			System.out.println("threadName = " + Thread.currentThread().getName()
					+ " at " + System.currentTimeMillis() + " into printA()");
			Thread.sleep(3000);
			System.out.println("threadName = " + Thread.currentThread().getName()
					+ " at " + System.currentTimeMillis() + " leave printA()");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public static void printB() {
		System.out.println("threadName = " + Thread.currentThread().getName()
				+ " at " + System.currentTimeMillis() + " into printB()");
		
		System.out.println("threadName = " + Thread.currentThread().getName()
				+ " at " + System.currentTimeMillis() + " leave printB()");
	}
	
	synchronized public void printC() {
		System.out.println("threadName = " + Thread.currentThread().getName()
				+ " at " + System.currentTimeMillis() + " into printC()");
		
		System.out.println("threadName = " + Thread.currentThread().getName()
				+ " at " + System.currentTimeMillis() + " leave printC()");
	}
}
