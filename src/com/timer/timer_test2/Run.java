package com.timer.timer_test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法schedule(TimerTask task,Date firstTime, long period)
 * 在指定的日期后，按指定的时间间隔周期性的无限循环地执行某一任务。
 * @author Administrator
 *
 */
public class Run {
	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("运行了！时间：" + new Date().toGMTString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 11:14:00";
			Date date = sdf.parse(dateString);
			System.out.println("字符串时间：" + date.toLocaleString() + "当前时间："+new Date().toLocaleString());
			Timer timer = new Timer();
			timer.schedule(task, date, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
