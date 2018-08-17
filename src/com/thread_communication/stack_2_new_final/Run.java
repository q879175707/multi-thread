package com.thread_communication.stack_2_new_final;

/**
 * 条件发生改变时并没有得到及时的响应，所以多个呈wait状态的线程被唤醒，继而
 * 执行list.remove(0)代码而出现异常。解决的办法是，将if改为while语句即可
 * 
 * 但是出现了假死情况。解决办法，使用notifyAll
 * 
 * 这是一生产，多消费者 情况。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C c1 = new C(myStack);
		C c2 = new C(myStack);
		C c3 = new C(myStack);
		C c4 = new C(myStack);
		C c5 = new C(myStack);
		P_Thread pThread = new P_Thread(p);
		pThread.start();
		C_Thread cThread1 = new C_Thread(c1);
		C_Thread cThread2 = new C_Thread(c2);
		C_Thread cThread3 = new C_Thread(c3);
		C_Thread cThread4 = new C_Thread(c4);
		C_Thread cThread5 = new C_Thread(c5);
		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
	}
}
