package com.etc.state_test3;

public class MyService {
	synchronized public static void serviceMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + "������ҵ�񷽷���");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
