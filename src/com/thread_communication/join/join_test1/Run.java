package com.thread_communication.join.join_test1;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
//		Thread.sleep(?);
		System.out.println("���뵱thread����ִ����Ϻ�����ִ��");
		System.out.println("������sleep�е�ֵ���������");
		System.out.println("����ȷ��");
	}
}
