package com.thread_communication.wait_notify.p_c_test;

/**
 * һ�������ߺ�һ�������߽������ݵĽ������ڿ���̨��ӡ����־��get��set�ǽ������е�
 * 
 * ����ڴ˻�������ƶ�������ߺͶ�������ߣ���ô�����й����м��п��ܳ��֡��������������
 * Ҳ�������е��̶߳���wating�ȴ�״̬
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		String lock = new String("");
		P p = new P(lock);
		C c = new C(lock);
		ThreadP pThread = new ThreadP(p);
		ThreadC cThread = new ThreadC(c);
		pThread.start();
		cThread.start();
	}
}
