package com.syn.syn_lock_in_1;

/**
 * �����������Լ������ٴλ�ȡ�Լ��ڲ�����
 * ������һ���̻߳�ȡ����������������ʱ�������û���ͷţ�
 * �����ٴ���Ҫ��ȡ������������ʱ���ǿ��Ի�ȡ�ģ����������
 * ����Ļ����ͻ����������
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
