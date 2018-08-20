此种方法等同于synchronized public static MyObject getInstance()
效率一样很低，全部代码被上锁，全部代码都是同步了，所以也会降低运行效率