package com.syn_two_lock;

/**
 * �첽��ԭ���ǳ��в�ͬ������һ���Ƕ�������
 * ����һ����Class����static������Class��
 * ���Զ�������ж���ʵ�������á�
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();
	}
}
