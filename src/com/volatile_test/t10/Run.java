package com.volatile_test.t10;

public class Run {
	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();
		System.out.println("��Ҫֹͣ����stopTread="
				+Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
