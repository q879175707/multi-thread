package com.timer.timer_test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule不具备追赶执行性
 * 
 * 时间11：20到13：39之间的时间对于的task任务被取消了，不执行了。
 * @author Administrator
 *
 */
public class Run5 {
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
			String dateString = "2018-8-20 11:21:00";
			Date date = sdf.parse(dateString);

			System.out.println("字符串时间：" + date.toLocaleString() + "当前时间：" + new Date().toLocaleString());

			timer.schedule(task, date, 5000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
