package com.thread_communication.thread_local.threadlocal33;

/**
 * 验证线程变量的隔离性
 * 子线程和父线程各有各自所拥有的值
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
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
