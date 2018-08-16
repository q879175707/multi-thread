package com.volatile_test.t16;

/**
 * ��Ȼ��main�����н�running�ֶ�����Ϊfalse�������̻߳���ͣ��������
 * ������Ϊ������RunThread�߳�ʱ������private boolean isRunning = true
 * �����ڹ�����ջ���̵߳�˽�ж�ջ�С�JVM����Ϊ-serverģʽʱΪ���߳����е�Ч�ʣ��߳�һֱ��
 * ˽�ж�ջ��ȡ��isRunning��ֵ��true��������thread.setRunning(false)��Ȼ��ִ��
 * ���µ�ȴ�ǹ�����ջ�е�isRunning����ֵΪfalse������һֱ������ѭ����״̬��
 * 
 * ����취ʹ��volatile�ؼ��֡���isRunning���д���ǿ�ƴӹ�����ջȡֵ��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			
			Thread.sleep(1000);
			
			thread.setRunning(false);
			System.out.println("already set Running false");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
