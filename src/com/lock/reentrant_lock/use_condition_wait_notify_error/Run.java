package com.lock.reentrant_lock.use_condition_wait_notify_error;

/**
 * ���лᱨ��illegalMonitorStateException
 * �����ԭ���Ǽ�������������취�Ǳ�����condition.await()��������
 * ֮ǰ����lock.lock()���ͬ��������
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new  MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
