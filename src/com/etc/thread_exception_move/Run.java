package com.etc.thread_exception_move;

public class Run {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		// ∂‘œÛ
		//myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		
		// ¿‡
		MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
		
	}
}
