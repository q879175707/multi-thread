package com.current_thread;

public class CountOperate  extends Thread{
	public CountOperate() {
		System.out.println("CountOperate -- begin");
		System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("CountOperate -- end");
	}
	
	@Override
	public void run() {
		super.run();
		
		System.out.println("run -- begin");
		System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("run -- end");
	}
}
