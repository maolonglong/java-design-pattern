package com.csl.singleton;

/**
 * @author MaoLongLong
 * @date 2021-03-16 22:21:58
 */
public class EagerSingletonTest extends SingletonTest<EagerSingleton> {

    public EagerSingletonTest() {
        super(EagerSingleton::getInstance);
    }
}
