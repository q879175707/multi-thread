package com.etc.thread_exception_move;

import java.lang.Thread.UncaughtExceptionHandler;

public class StateUncaughtExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("��̬���쳣����");
		e.printStackTrace();
	}

}
