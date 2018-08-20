package com.timer.timer_test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask是以队列的方式一个一个被顺序执行的，所以执行的时间有可能和预期的时间不一致
 * 因为前面的任务有可能消耗的时间较长，则后面的任务运行的时间也会被延迟。
 * task1 需要用时20秒执行完任务，所以它影响到了task2
 * @author Administrator
 *
 */
public class Run2Later {
	private static Timer timer = new Timer();
	
	public static class MyTask1 extends TimerTask {
		public void run() {
			try {
				System.out.println("运行了1！时间为：" + new Date().toLocaleString());
				Thread.sleep(20000);
				System.out.println("结束了1！时间为：" + new Date().toLocaleString());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static class MyTask2 extends TimerTask {
		public void run() {
				System.out.println("运行了2！时间为：" + new Date().toLocaleString());
				System.out.println("结束了2！时间为：" + new Date().toLocaleString());
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
