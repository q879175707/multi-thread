package com.syn.has_self_private_num;

public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA aThread = new ThreadA(numRef);
		aThread.start();
		ThreadB bThread = new ThreadB(numRef);
		bThread.start();
	}
}
