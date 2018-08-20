package com.timer.timer_test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ��ʱ�������û������Ҳ����ʹ�����������������ִ�������ʱ�䱻��ʱ��
 * ��ô��һ�������ִ��ʱ��ο� ������һ���������ʱ��ʱ�������㡣
 * 
 * @author Administrator
 *
 */
public class Run4 {
	private static Timer timer = new Timer();
	private static int runCount = 0;

	public static class MyTask1 extends TimerTask {
		@Override
		public void run() {
			try {
				System.out.println("1 begin	 �����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
				Thread.sleep(5000);
				System.out.println("1 end	 �����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());

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
			String dateString = "2018-8-20 11:21:00";
			Date date = sdf.parse(dateString);

			System.out.println("�ַ���ʱ�䣺" + date.toLocaleString() + "��ǰʱ�䣺" + new Date().toLocaleString());

			timer.scheduleAtFixedRate(task, date, 2000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
