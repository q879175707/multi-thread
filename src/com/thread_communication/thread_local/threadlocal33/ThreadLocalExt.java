package com.thread_communication.thread_local.threadlocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal{
	
	@Override
	protected Object initialValue() {
		
		return new Date().getTime();
	}
}
