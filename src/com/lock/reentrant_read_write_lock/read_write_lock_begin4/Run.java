package com.lock.reentrant_read_write_lock.read_write_lock_begin4;

/**
 *���д���󣬵�write����ִ����ϣ�����ִ��read����
 *˵����д���������ǻ����
 *
 *����д������д��������дд�����ǻ���ģ��������������첽�ģ��ǻ����
 *ֻҪ��д�������ǻ���ġ�
 *
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		Thread.sleep(1000);
		
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
	}
}
