package com.timer.timer_test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ����schedule(TimerTask task,Date firstTime, long period)
 * ��ָ�������ں󣬰�ָ����ʱ���������Ե�����ѭ����ִ��ĳһ����
 * @author Administrator
 *
 */
public class Run {
	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("�����ˣ�ʱ�䣺" + new Date().toGMTString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 11:14:00";
			Date date = sdf.parse(dateString);
			System.out.println("�ַ���ʱ�䣺" + date.toLocaleString() + "��ǰʱ�䣺"+new Date().toLocaleString());
			Timer timer = new Timer();
			timer.schedule(task, date, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
