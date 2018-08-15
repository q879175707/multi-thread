package com.syn.dirty_read;

public class Test {
	/**
	 * getValue 方法没有加同步关键字，出现了脏读，如果加上就避免了脏读的出现。
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			ThreadA thread = new ThreadA(publicVar);
			thread.start();
			Thread.sleep(200); // 打印结果受此值大小影响
			publicVar.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
