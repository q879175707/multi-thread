package com.thread_communication.thread_local.threadlocl22;

public class ThreadLocalExt extends ThreadLocal<String>{
	
	@Override
	protected String initialValue() {
		
		return "����Ĭ��ֵ����һ��get������null";
	}
}
