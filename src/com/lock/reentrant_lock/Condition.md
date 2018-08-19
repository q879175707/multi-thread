condition类
在condition.await()方法调用之前必须调用lock.lock()获得同步监视器

Object类中的wait()方法相当于Condition类中的await()方法。
Object类中的wait(long timeout)方法相当于Condition类中的await(long time,TimeUnit unit)方法。
Object类中的notify()方法相当于Condition类中的signal()方法。
Object类中的notifyAll()方法相当于Condition类中的signalAll()方法。


使用同一个condition，会唤醒同样condition的线程。
Condition对象可以唤醒部分指定线程，有助于提升程序运行的效率。
可以先对线程进行分组，然后再唤醒指定组中的线程。