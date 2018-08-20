package com.timer.timer_test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务虽然执行完了，但进程还未销毁，查看构造方法可以得知，创建一个Timer就是启动一个线程，
 * 这个新启动的线程并不是守护线程，它一直在运行。
 * @author Administrator
 *
 */
public class Run1 {
	private static Timer timer = new Timer();
	
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
