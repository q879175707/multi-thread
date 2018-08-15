package com.syn.syn_not_extends;

/**
 * 同步不能继承在子类中添加synchronized关键字
 * int sub next sleep begin threadname =A time = 1534296537910
	int sub next sleep end threadname = A time = 1534296542912
	int main next sleep begin threadName = A time = 1534296542912
	int main next sleep  end thread name = A time = 1534296547912
	int sub next sleep begin threadname =B time = 1534296547912
	int sub next sleep end threadname = B time = 1534296552913
	int main next sleep begin threadName = B time = 1534296552913
	int main next sleep  end thread name = B time = 1534296557913
	
	在子类中没有添加synchronized关键字
	int sub next sleep begin threadname =A time = 1534296648773
	int sub next sleep begin threadname =B time = 1534296648773
	int sub next sleep end threadname = A time = 1534296653773
	int sub next sleep end threadname = B time = 1534296653773
	int main next sleep begin threadName = A time = 1534296653773
	int main next sleep  end thread name = A time = 1534296658774
	int main next sleep begin threadName = B time = 1534296658774
	int main next sleep  end thread name = B time = 1534296663774
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Sub subRef = new Sub();
		MyThreadA a = new MyThreadA(subRef);
		a.setName("A");
		a.start();
		MyThreadB b = new MyThreadB(subRef);
		b.setName("B");
		b.start();
	}
}
