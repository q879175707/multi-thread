package com.syn.dirty_read;

public class Test {
	/**
	 * getValue ����û�м�ͬ���ؼ��֣������������������Ͼͱ���������ĳ��֡�
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			ThreadA thread = new ThreadA(publicVar);
			thread.start();
			Thread.sleep(200); // ��ӡ����ܴ�ֵ��СӰ��
			publicVar.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
