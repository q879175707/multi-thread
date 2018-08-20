package com.timer.timer_test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer的cancel方法与TimerTask不同
 * Timer类中的cancel方法是将任务队列中的
 * 全部任务都清空，并且进程被销毁。
 * @author Administrator
 */
public class Run3 {
	private static Timer timer = new Timer();
	public static class MyTaskA extends TimerTask {
		@Override
		public void run() {
				System.out.println("A 运行了！时间为：" + new Date().toLocaleString());
				timer.cancel();
		}
	}
	public static class MyTaskB extends TimerTask {
		@Override
		public void run() {
			System.out.println("B 运行了！时间为：" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 11:21:00";
			Date date = sdf.parse(dateString);
			System.out.println("字符串时间：" + date.toLocaleString() + "当前时间："+new Date().toLocaleString());
			timer.schedule(taskA, date, 4000);
			timer.schedule(taskB, date, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
