package com.syn.synchronized_update_new_value;

/**
 * synchronized����ʹ����̷߳���ͬһ����Դ����ͬ���ԣ������������н��̹߳���
 * �ڴ��е�˽�б����빫���ڴ��еı���ͬ���Ĺ��ܡ�
 */
public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("�Ѿ�����ֹͣ��������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
