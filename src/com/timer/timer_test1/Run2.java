package com.timer.timer_test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer中允许有多个TimerTask任务，注意Timer创建不是守护线程。
 * 如果设置为守护线程,会出现某任务没有完成随着主线程的结束就结束了。
 * @author Administrator
 *
 */
public class Run2 {
	private static Timer timer = new Timer();
	
	public static class MyTask1 extends TimerTask {
		public void run() {
			System.out.println("运行了1！时间为：" + new Date().toLocaleString());
		}
	}
	
	public static class MyTask2 extends TimerTask {
		public void run() {
			System.out.println("运行了2！时间为：" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2018-8-19 20:52:15";
			String dateString2 = "2018-8-19 20:52:20";
			Date date1 = sdf1.parse(dateString1);
			Date date2 = sdf1.parse(dateString2);
			
			System.out.println("字符串1时间：" + date1.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			System.out.println("字符串2时间：" + date2.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			
			timer.schedule(task1, date1);
			timer.schedule(task2, date2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
