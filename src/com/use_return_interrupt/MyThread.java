package com.use_return_interrupt;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("ֹͣ�ˣ�");
				return;
			}
			System.out.println("timer = " + System.currentTimeMillis());
		}
	}
}
