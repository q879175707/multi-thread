package com.syn.syn_block_string;

/**
 * ����̳߳��С������������Ϊͬһ�������ǰ���£�
 * ͬһʱ��ֻ��һ���߳̿���ִ��synchronized����this����ͬ��������еĴ��롣
 * �������߳�a���߳�b���� ͬһ��ʵ��service��������anyString
 * 
 * ������������ǳ�Ա������ôÿ���̻߳�õ����ǲ�һ���ģ��̻߳��첽ִ��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a= new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
