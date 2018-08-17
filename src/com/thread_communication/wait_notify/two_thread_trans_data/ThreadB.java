package com.thread_communication.wait_notify.two_thread_trans_data;

public class ThreadB extends Thread {
	private MyList list;

	public ThreadB(MyList list) {
		this.list = list;
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (list) {
					if (list.size() == 5) {
						System.out.println("== 5�ˣ��߳�bҪ�˳��ˣ�");
						throw new InterruptedException();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
