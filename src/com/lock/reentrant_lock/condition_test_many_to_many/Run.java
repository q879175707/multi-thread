package com.lock.reentrant_lock.condition_test_many_to_many;

/**
 * @author Administrator
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA[] threadA = new ThreadA[10];
		ThreadB[] threadB = new ThreadB[10];
		for (int i = 0; i < 10; i++) {
			threadA[i] = new ThreadA(service);
			threadB[i] = new ThreadB(service);
			threadA[i].start();
			threadB[i].start();
		}
	}
}
