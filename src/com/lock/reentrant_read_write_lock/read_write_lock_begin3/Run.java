package com.lock.reentrant_read_write_lock.read_write_lock_begin3;

/**
 *��ö����󣬵�read����ִ����ϣ�����ִ��write����
 *˵������д�������ǻ����
 *
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		Thread.sleep(1000);
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
