package com.csl.singleton;

/**
 * 双重检查（支持多线程访问）
 *
 * @author MaoLongLong
 * @date 2021-03-16 22:29:26
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class DoubleCheckSingleton {

    /**
     * 之所以要加 volatile 关键字，是因为并发环境下 JVM 可能会对创建对象的三个步骤进行指令重排
     *      1. 为对象分配内存
     *      2. 初始化对象
     *      3. 将 instance 指向内存空间
     * 如果重排成 1 > 3 > 2 ，可能会导致其他线程拿到未初始化的对象
     */
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                // 由于第一次检查是在没有加锁的情况下进行，所以需要再次检查
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
