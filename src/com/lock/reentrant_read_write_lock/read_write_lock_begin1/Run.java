package com.lock.reentrant_read_write_lock.read_write_lock_begin1;

/**
 * �ӽ��ʱ�俴�������̼߳���ͬʱ����lock������������Ĵ��롣
 * ˵���ڴ�ʹ����Lock.readLock()����������߳�������Ч�ʣ�
 * �������߳�ͬʱִ��lock������������Ĵ���
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
