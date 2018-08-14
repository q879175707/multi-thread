package com.suspend_resume_deal_locik;

public class SynchronizedObject {
	synchronized public void printString() {
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a线程永久的suspend了");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
