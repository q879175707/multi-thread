package com.volatile_test.atomic_interger_no_safe;

/**
 * ��addNum�������������synchronized�ؼ��֣���ӡ��˳���Ǵ���ġ�
 * ������������������ΪaddAndGet������ԭ���Եģ��������ͷ���֮���
 * ����ȴ����ԭ�ӵġ�����ͬ�������н����������Ҫ�Ľ����
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			MyThread[] array = new MyThread[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread(service);
			}
			
			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}
			
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
