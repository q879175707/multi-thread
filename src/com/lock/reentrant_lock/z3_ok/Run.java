package com.lock.reentrant_lock.z3_ok;

/**
 * ����ֻ̨��ӡ��һ����ĸA��ԭ���ǵ�����condition�����await������ʹ��ǰ
 * ִ��������߳̽����˵ȴ�waiting״̬��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.start();
	}
}
