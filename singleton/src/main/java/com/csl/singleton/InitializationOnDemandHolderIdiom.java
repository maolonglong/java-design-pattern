package com.csl.singleton;

/**
 * 《Java并发编程艺术》：
 *
 *      JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前），会执行类的初始化。
 *  在执行类的初始化期间，JVM会去获取一个锁。这个锁可以同步多个线程对同一个类的初始化。
 *
 *      基于这个特性，可以实现另一种线程安全的延迟初始化方案
 * （这个方案被称之为Initialization On Demand Holder idiom）。
 *
 * @author MaoLongLong
 * @date 2021-03-16 23:14:12
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class InitializationOnDemandHolderIdiom {

    private InitializationOnDemandHolderIdiom() {
    }

    public static InitializationOnDemandHolderIdiom getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final InitializationOnDemandHolderIdiom INSTANCE =
                new InitializationOnDemandHolderIdiom();
    }
}
