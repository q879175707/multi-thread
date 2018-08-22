package com.etc.thread_create_exception;

public class MyThread extends Thread{
	@Override
	public void run() {
		String username = null;
		System.out.println(username.hashCode());
	}
}
