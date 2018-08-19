package com.lock.reentrant_lock.use_condition_wait_notify_error;

/**
 * 运行会报错illegalMonitorStateException
 * 报错的原因是监视器出错，解决办法是必须在condition.await()方法调用
 * 之前调用lock.lock()获得同步监视器
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new  MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
