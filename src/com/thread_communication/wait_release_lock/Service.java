package com.thread_communication.wait_release_lock;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				// wait() 自动释放锁，两个线程都会执行上面的输出语句
//				lock.wait();
				// 改为sleep，只有一个线程能输出上面的语句进入这个方法。
				Thread.sleep(40000);
				System.out.println("end   wati()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
