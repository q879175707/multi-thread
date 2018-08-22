package com.etc.group_inner_stop;
/**
 * 通过将线程归属到线程组中，当调用线程组ThreadGroup和interrupt方法时。
 * 可以将该组中的所有正在运行的线程批量停止。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadGroup group = new ThreadGroup("我的线程组");
			for (int i = 0; i < 5; i++) {
				MyThread thread = new MyThread(group, "线程" + (i + 1));
				thread.start();
			}
			Thread.sleep(5000);
			group.interrupt();
			System.out.println("调用了interrupt()方法");
		} catch (InterruptedException e) {
			System.out.println("停了！");
			e.printStackTrace();
		}
	}
}
