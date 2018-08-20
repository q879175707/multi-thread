package com.timer.timer_test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer类中的cancel方法有时不一定会停止执行计划任务，
 * 而是正常执行,并且没有停止
 * 
 * 因为timer类中的cancel方法有时没有抢到queue锁，所以TimerTask类中的任务继续正常执行。
 * @author Administrator
 */
public class Run4 {
	static int i = 0;
	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "		运行了！" + i);
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			try {
				i++;
				MyTask task = new MyTask();
				Timer timer = new Timer();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = "2018-8-20 11:14:00";
				Date date = sdf.parse(dateString);
				timer.schedule(task, date);
				timer.cancel();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
}
