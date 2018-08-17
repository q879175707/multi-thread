package com.thread_communication.wait_notify.stack_2_new;

public class C {
	
	private MyStack myStack;
	
	public C(MyStack myStack) {
		this.myStack = myStack;
	}
	
	public void popService() {
		System.out.println("pop=" + myStack.pop());
	}
}
