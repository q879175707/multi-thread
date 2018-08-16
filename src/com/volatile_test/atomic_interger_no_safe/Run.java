package com.volatile_test.atomic_interger_no_safe;

/**
 * 在addNum方法中如果不加synchronized关键字，打印的顺序是错误的。
 * 出现这样的问题是因为addAndGet（）是原子性的，但方法和方法之间的
 * 调用却不是原子的。加上同步后，运行结果是我们想要的结果。
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
