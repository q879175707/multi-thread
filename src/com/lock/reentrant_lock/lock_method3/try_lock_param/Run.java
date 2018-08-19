package com.lock.reentrant_lock.lock_method3.try_lock_param;

/**
 * boolean tryLock(long timeout,TimeUnit unit)��������
 * ������ڸ����ȴ�ʱ����û�б���һ���̱߳��֣�
 * ���ҵ�ǰ�߳�δ���жϣ���ȡ����
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		final MyService service = new MyService();
		Runnable runnableRef = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "����waitMethodʱ�䣺" + System.currentTimeMillis());
				service.waitMethod();
			}
		};
		
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}
}
