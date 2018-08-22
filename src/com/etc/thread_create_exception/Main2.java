package com.etc.thread_create_exception;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * ����setUncaughtExceptionHandler�Ǹ�ָ���̶߳������õ��쳣��������
 * ��Thread���л�����ʹ��setDefaultUncaughtExceptionHandler������
 * ���е��̶߳��������쳣��������
 * @author Administrator
 *
 */
public class Main2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("�߳�t1");
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("�̣߳�" + t.getName() + " �������쳣");
				e.printStackTrace();
			}
		});
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("�߳�t2");
		t2.start();
	}
}
