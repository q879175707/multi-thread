package com.timer.timer_test3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, long delay)
 * 以当前时间为参考，在此时间基础上延迟指定的毫秒数后，执行一次TimerTask任务。
 */
public class Run {
	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("运行了！时间为：" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		MyTask task  = new MyTask();
		Timer timer = new Timer();
		System.out.println("当前时间：" + new Date().toLocaleString());
		
		// 延迟7秒后执行。
		timer.schedule(task, 7000);
	}
}
