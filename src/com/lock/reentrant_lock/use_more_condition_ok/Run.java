package com.lock.reentrant_lock.use_more_condition_ok;

/**
 * �������к�ֻ���߳�A�������ˡ�
 * ͨ��ʵ����Ե�֪��ʹ��ReentranLock������Ի���ָ��������̣߳�
 * ���ǿ��Ʋ����߳���Ϊ�ķ��㷽ʽ��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		Thread.sleep(3000);
		service.signalAll_A();
	}
}
