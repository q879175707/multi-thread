package com.thread_communication.two_thread_trans_data;

/**
 * �����߳���Ȼʵ����ͨ�ţ������и��׶ˣ�Threadb��ͣ��ͨ��while���
 * ѭ�����Ƽ��ĳһ���������������˷�CPU��Դ��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyList list = new MyList();
		ThreadA a = new ThreadA(list);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(list);
		b.setName("B");
		b.start();
	}
}
