package com.thread_communication.join.join_mor_test;

public class RunFirst {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		b.start();
		System.out.println("main end=" + System.currentTimeMillis());
	}
}
