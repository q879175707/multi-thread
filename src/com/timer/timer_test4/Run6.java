package com.timer.timer_test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * scheduleAtFixedRate具备追赶执行性
 * 
 * 两个时间段的任务被补充性的执行了，这就是Task任务追赶执行的特点。
 * @author Administrator
 *
 */
public class Run6 {
	private static Timer timer = new Timer();
	public static class MyTask1 extends TimerTask {
		@Override
		public void run() {
				System.out.println("1 begin	 运行了！时间为：" + new Date().toLocaleString());
				System.out.println("1 end	 运行了！时间为：" + new Date().toLocaleString());
		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task = new MyTask1();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 13:46:40";
			Date date = sdf.parse(dateString);

			System.out.println("字符串时间：" + date.toLocaleString() + "当前时间：" + new Date().toLocaleString());

			timer.scheduleAtFixedRate(task, date, 5000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
