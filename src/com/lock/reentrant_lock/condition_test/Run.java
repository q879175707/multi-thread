package com.lock.reentrant_lock.condition_test;

/**
 * ͨ��ʹ��condition���󣬳ɹ�ʵ�ֽ����ӡ��Ч����
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
		ThreadB b = new ThreadB(service);
		b.start();
	}
}