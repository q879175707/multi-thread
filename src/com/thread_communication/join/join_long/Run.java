package com.thread_communication.join.join_long;

/**
 * join(2000)��sleep(2000)��ʲô�����أ�
 * ����join(long)�Ĺ������ڲ���ʹ��wait(long)������ʵ�ֵģ�
 * ����join���������ͷ������ص㡣
 * ��ִ��wait�����󣬵�ǰ�̵߳������ͷţ���ô�����߳̾Ϳ��Ե��ô�
 * �߳��е�ͬ�������ˡ�
 * 
 * ��Thread.sleep(long)����ȴ���ͷ���
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.join(2000);
//			Thread.sleep(2000);
			System.out.println("end time =" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
