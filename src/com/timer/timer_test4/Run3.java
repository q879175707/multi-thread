package com.timer.timer_test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 如果执行任务的时间没有被延时，那么下一次任务的执行时间参考 
 * 的是上一次任务的结束时的时间来计算。
 * 
 * @author Administrator
 *
 */
public class Run3 {
	private static Timer timer = new Timer();
	private static int runCount = 0;

	public static class MyTask1 extends TimerTask {
		@Override
		public void run() {
			try {
				System.out.println("1 begin	 运行了！时间为：" + new Date().toLocaleString());
				Thread.sleep(2000);
				System.out.println("1 end	 运行了！时间为：" + new Date().toLocaleString());

				runCount++;
				if (runCount == 5) {
					timer.cancel();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task = new MyTask1();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 13:45:00";
			Date date = sdf.parse(dateString);

			System.out.println("字符串时间：" + date.toLocaleString() + "当前时间：" + new Date().toLocaleString());

			timer.scheduleAtFixedRate(task, date, 3000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
