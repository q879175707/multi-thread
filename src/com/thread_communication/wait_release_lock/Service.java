package com.thread_communication.wait_release_lock;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				// wait() �Զ��ͷ����������̶߳���ִ�������������
//				lock.wait();
				// ��Ϊsleep��ֻ��һ���߳��������������������������
				Thread.sleep(40000);
				System.out.println("end   wati()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
