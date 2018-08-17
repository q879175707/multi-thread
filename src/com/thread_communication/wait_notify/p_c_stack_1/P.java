package com.thread_communication.wait_notify.p_c_stack_1;

public class P {
	private MyStack myStack;
	public P(MyStack myStack) {
		this.myStack = myStack;
	}
	
	public void pushService() {
		myStack.push();
	}
}
