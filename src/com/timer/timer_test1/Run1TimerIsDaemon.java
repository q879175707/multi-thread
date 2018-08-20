package com.timer.timer_test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 程序运行后迅速结束当前的进程，并且TimerTask中的任务不再被运行，因为进程以及结束了。
 * 如果计划任务时间早于当前时间则立即执行task任务。
 * @author Administrator
 *
 */
public class Run1TimerIsDaemon {
	private static Timer timer = new Timer(true);
	
	public static class MyTask extends TimerTask {
		public void run() {
			System.out.println("运行了！时间为：" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-19 20:34:00";
			Date date = sdf.parse(dateString);
			System.out.println("字符串时间：" + date.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			timer.schedule(task, date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
