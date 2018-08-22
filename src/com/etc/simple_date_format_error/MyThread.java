package com.etc.simple_date_format_error;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
	private SimpleDateFormat sdf;
	private String dateString;
	public MyThread(SimpleDateFormat sdf, String dateString) {
		this.sdf = sdf;
		this.dateString = dateString;
	}
	
	@Override
	public void run() {
		try {
			Date date = sdf.parse(dateString);
			String newDateString = sdf.format(date).toString();
			if (!newDateString.equals(dateString)) {
				System.out.println("ThreadName" + Thread.currentThread().getName()
						+ "	������  �����ַ�����" + dateString + "	ת���ɵ�����Ϊ:" + newDateString);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
