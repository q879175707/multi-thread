package com.etc.thread_exception_move;

public class Run2 {
	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("�ҵ��߳���");
		MyThread myThread = new MyThread(group, "�ҵ��߳�");
		// ����
		//myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		
		// ��
		//MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
		
	}
}
