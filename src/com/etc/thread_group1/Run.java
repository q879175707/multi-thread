package com.etc.thread_group1;

/**
 * 在默认的情况下，线程组中的一个线程出现异常不会影响到其他线程的运行。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup group = new ThreadGroup("我的线程组");
		MyThread newT = new MyThread(group, "报错线程", "a");
		newT.start();
		Thread.sleep(100);
		MyThread[] myThread = new MyThread[10];
		for (int i = 0; i < 10; i++) {
			myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
			myThread[i].start();
		}
		
	}
}
