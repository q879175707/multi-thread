package com.thread_communication.join.join_test2;

/**
 * ����join��������ʹ�������̶߳���x����ִ��run�����е�����
 * �ȴ��߳�x���ٺ��ټ���ִ���߳�z����Ĵ��롣
 * 
 * ����join����ʹ�߳��Ŷ����еĶ��ã���Щ����ͬ��������Ч����
 * join��synchronized�������ǣ�
 * join���ڲ�ʹ��wait()�������еȴ�����synchronized�ؼ���
 * ʹ�õ��Ƕ��������ԭ����Ϊͬ����
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.join();
			System.out.println("���뵱thread����ִ����Ϻ�����ִ�У���������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
