package com.syn.syn_out_asyn;

public class ThreadA extends Thread{
	
	private MyList list;
	
	public ThreadA(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		for(int i = 0; i < 100000; i++) {
			list.add("threadA" + (i + 1));
		}
	}
}
