package com.timer.timer_test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务时间超过 周期时间，会延时。等待任务完成后，再执行下一个任务。
 * @author Administrator
 *
 */
public class Run2_1 {
	public static class MyTaskA extends TimerTask {
		@Override
		public void run() {
			try {
				System.out.println("A 运行了！时间为：" + new Date());
				Thread.sleep(5000);
				System.out.println("A 结束了！时间为：" + new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTaskA task = new MyTaskA();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 11:21:00";
			Date date = sdf.parse(dateString);
			Timer timer = new Timer();
			System.out.println("字符串时间：" + date.toLocaleString() + "当前时间："+new Date().toLocaleString());
			timer.schedule(task, date, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
