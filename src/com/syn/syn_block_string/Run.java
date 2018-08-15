package com.syn.syn_block_string;

/**
 * 多个线程持有“对象监视器”为同一个对象的前提下，
 * 同一时间只有一个线程可以执行synchronized（非this对象）同步代码块中的代码。
 * 本例中线程a与线程b持有 同一个实例service的锁对象anyString
 * 
 * 如果在锁对象是成员对象，那么每个线程获得的锁是不一样的，线程会异步执行
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
