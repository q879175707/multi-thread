package com.thread_communication.p_c_all_wait;

/**
 * ��Ȼ�Ѿ�ͨ��wait/notifyͨ���ˣ������ܱ�֤notify���ѵ������࣬Ҳ��
 * ��ͬ�࣬���硰�����ߡ����ѡ������ߡ����������ߡ����ѡ������ߡ������������
 * 
 * ������������еı��ʻ��ٳɶ࣬�ͻᵼ�����е��̶߳����ܼ���������ȥ����Ҷ�
 * �ڵȴ�������waiting״̬������Ҳ�ͼ�����ȥ�ˡ�
 * 
 * �������ֵ���Ҫԭ�����п�����������ͬ�ࡣ����취�����⻽��ͬ�࣬������Ҳ
 * һͬ���Ѿͽ���ˡ�
 * @author Administrator
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		
		P p = new P(lock);
		C c = new C(lock);
		
		// ����������,����������
		ThreadP[] pThread = new ThreadP[2];
		ThreadC[] cThread = new ThreadC[2];
		
		for (int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP(p);
			pThread[i].setName("������" + (i + 1));
			
			cThread[i] = new ThreadC(c);
			cThread[i].setName("������" + (i + 1));
			
			pThread[i].start();
			cThread[i].start();
		}
		
		Thread.sleep(5000);
		
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + "����"
					+ threadArray[i].getState());
		}
	}
}
