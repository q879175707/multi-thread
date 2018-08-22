package com.etc.group_add_thread;

/**
 * 线程组中有两个线程，另外两个线程一直无限的并且间隔3秒打印日志。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadGroup group = new ThreadGroup("秦旭亮的线程组");
		Thread aThread = new Thread(group, a);
		Thread bThread = new Thread(group, b);
		aThread.start();
		bThread.start();
		System.out.println("活动的线程数为："+group.activeCount());
		System.out.println("活动的线程组名称为："+group.getName());
	}
}
