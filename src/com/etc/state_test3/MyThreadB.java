package com.etc.state_test3;

public class MyThreadB extends Thread{
	@Override
	public void run() {
		MyService.serviceMethod();
	}
}
