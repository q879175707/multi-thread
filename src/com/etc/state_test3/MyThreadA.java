package com.etc.state_test3;

public class MyThreadA extends Thread{
	@Override
	public void run() {
		MyService.serviceMethod();
	}
}
