package com.interrupted.use_return_interrupt;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("Í£Ö¹ÁË£¡");
				return;
			}
			System.out.println("timer = " + System.currentTimeMillis());
		}
	}
}
