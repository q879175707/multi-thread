package com.interrupted.current_thread;

public class Run2 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
