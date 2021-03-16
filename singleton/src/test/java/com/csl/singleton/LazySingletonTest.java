package com.csl.singleton;

/**
 * @author MaoLongLong
 * @date 2021-03-16 22:10:00
 */
public class LazySingletonTest extends SingletonTest<LazySingleton> {

    public LazySingletonTest() {
        super(LazySingleton::getInstance);
    }
}
