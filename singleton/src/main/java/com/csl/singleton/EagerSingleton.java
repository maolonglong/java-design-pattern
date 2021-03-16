package com.csl.singleton;

/**
 * 饿汉单例模式
 *
 * @author MaoLongLong
 * @date 2021-03-16 22:13:47
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
