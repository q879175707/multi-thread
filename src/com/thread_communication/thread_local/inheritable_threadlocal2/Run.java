package com.thread_communication.thread_local.inheritable_threadlocal2;

/**
 * 使用inheritableThreadLocal类可以让子线程从父线程中取得值
 * 在继承的同时还可以对值进行进一步的处理
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("在Main线程中取值=" + Tools.t1.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
