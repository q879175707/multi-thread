package com.thread_communication.thread_local.threadlocl22;

public class ThreadLocalExt extends ThreadLocal<String>{
	
	@Override
	protected String initialValue() {
		
		return "我是默认值，第一次get不再是null";
	}
}
