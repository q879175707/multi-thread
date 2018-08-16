package com.volatile_test.t16;

/**
 * 虽然在main方法中将running手动设置为false，但是线程还是停不下来。
 * 这是因为在启动RunThread线程时，变量private boolean isRunning = true
 * 存在于公共堆栈及线程的私有堆栈中。JVM设置为-server模式时为了线程运行的效率，线程一直在
 * 私有堆栈中取得isRunning的值是true。而代码thread.setRunning(false)虽然被执行
 * 更新的却是公共堆栈中的isRunning变量值为false，所以一直就是死循环的状态。
 * 
 * 解决办法使用volatile关键字。对isRunning进行处理。强制从公共堆栈取值。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			
			Thread.sleep(1000);
			
			thread.setRunning(false);
			System.out.println("already set Running false");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
