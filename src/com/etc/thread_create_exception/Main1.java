package com.etc.thread_create_exception;

/**
 * ��java�Ķ��̼߳����У����ԶԶ��߳��е��쳣���С���׽��
 * ʹ�õ���UncaughtExceptionHandler�࣬�Ӷ�����
 * �Է������쳣������Ч�Ĵ���
 * @author Administrator
 *
 */
public class Main1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
