package com.thread_communication.p_c_all_wait_fix;

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
					System.out.println("������" + Thread.currentThread().getName() + " WAITING�ˡ�");
					lock.wait();
				}
				System.out.println("������" + Thread.currentThread().getName() + " Runable ��");
				ValueObject.value = "";
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
