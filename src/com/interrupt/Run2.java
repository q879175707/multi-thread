package com.interrupt;

public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("ÊÇ·ñÍ£Ö¹ 1£¿=" + Thread.interrupted());
		System.out.println("ÊÇ·ñÍ£Ö¹ 2£¿=" + Thread.interrupted());
		System.out.println("end!");
	}
}
