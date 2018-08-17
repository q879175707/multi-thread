package com.thread_communication.wait_notify.notify_hold_lock;

/**
 * 必须执行完nofity（）方法所在的同步synchronized代码块后
 * 才会释放锁
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Object lock = new Object();
		
		ThreadA a = new ThreadA(lock);
		a.setName("A");
		a.start();
		
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.setName("B");
		notifyThread.start();
		
		synNotifyMethodThread c = new synNotifyMethodThread(lock);
		c.setName("C");
		c.start();
	}
}
