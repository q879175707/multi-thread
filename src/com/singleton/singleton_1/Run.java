package com.singleton.singleton_1;

/**
 * ��Ȼȡ��һ�������ʵ����������ڶ��̻߳����У�����ֶ��ʵ���������
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}
}
