package com.thread_communication.thread_local.inheritable_threadlocal;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal{
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

}
