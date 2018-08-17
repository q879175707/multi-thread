package com.thread_communication.p_c_all_wait;

// Consumer
public class C {
	private String lock;

	public C(String lock) {
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println("消费者" + Thread.currentThread().getName() + " WAITING了☆");
					lock.wait();
				}
				System.out.println("消费者" + Thread.currentThread().getName() + " Runable 了");
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
