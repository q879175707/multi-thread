package com.thread_communication.thread_local.threadlocal11;

/**
 * �����н��������һ�ε���t1�����get����ʱ���ص�ֵ��null��ͨ������set
 * ��ֵ��˳��ȡ��ֵ����ӡ�ڿ���̨�ϡ�
 * ��ThreadLocal������Ǳ����ڲ�ͬ�̼߳�ĸ����ԣ�Ҳ���ǲ�ͬ�߳�ӵ���Լ�
 * ��ֵ����ͬ�̵߳�ֵ�ǿ��Է���ThreadLocal���н��б���ġ�
 * @author Administrator
 *
 */
public class Run {
	public static ThreadLocal<String> t1 = new ThreadLocal();
	public static void main(String[] args) {
		if (t1.get() == null) {
			System.out.println("��δ�Ź�ֵ");
			t1.set("�ҵ�ֵ");
		}
		
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
