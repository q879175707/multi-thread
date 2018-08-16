package com.syn.synchronized_update_new_value;

/**
 * synchronized可以使多个线程访问同一个资源具有同步性，而且它还具有将线程工作
 * 内存中的私有变量与公共内存中的变量同步的功能。
 */
public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("已经发起停止的命令了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
