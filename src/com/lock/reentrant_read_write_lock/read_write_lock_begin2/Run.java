package com.lock.reentrant_read_write_lock.read_write_lock_begin2;

/**
 * ʹ��д������lock.writeLock()��Ч������ͬһʱ��ֻ����һ���߳�
 * ִ��lock��������Ĵ��롣
 *
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
		b.start();
	}
}
