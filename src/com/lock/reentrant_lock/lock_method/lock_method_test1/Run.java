package com.lock.reentrant_lock.lock_method.lock_method_test1;

/**
 * ����int getHoldCount()������
 * ��ѯ��ǰ�̱߳��ִ����ĸ�����Ҳ���ǵ���lock()�����Ĵ�����
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		service.serviceMethod1();
	}
}
