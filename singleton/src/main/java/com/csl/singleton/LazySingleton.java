package com.csl.singleton;

/**
 * 简单的懒汉单例模式（不支持多线程访问）
 *
 * @author MaoLongLong
 * @date 2021-03-16 22:08:34
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
