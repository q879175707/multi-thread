package com.thread_communication.wait_notify.stack_2_new_final;

public class P {
	private MyStack myStack;
	public P(MyStack myStack) {
		this.myStack = myStack;
	}
	
	public void pushService() {
		myStack.push();
	}
}
