package com.thread_communication.wait_notify.notify_hold_lock;

/**
 * ����ִ����nofity�����������ڵ�ͬ��synchronized������
 * �Ż��ͷ���
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
