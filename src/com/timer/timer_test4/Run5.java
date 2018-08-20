package com.timer.timer_test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule���߱�׷��ִ����
 * 
 * ʱ��11��20��13��39֮���ʱ����ڵ�task����ȡ���ˣ���ִ���ˡ�
 * @author Administrator
 *
 */
public class Run5 {
	private static Timer timer = new Timer();
	public static class MyTask1 extends TimerTask {
		@Override
		public void run() {
				System.out.println("1 begin	 �����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
				System.out.println("1 end	 �����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task = new MyTask1();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 11:21:00";
			Date date = sdf.parse(dateString);

			System.out.println("�ַ���ʱ�䣺" + date.toLocaleString() + "��ǰʱ�䣺" + new Date().toLocaleString());

			timer.schedule(task, date, 5000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
