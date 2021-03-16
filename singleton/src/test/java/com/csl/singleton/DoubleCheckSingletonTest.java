package com.csl.singleton;

/**
 * @author MaoLongLong
 * @date 2021-03-16 23:01:27
 */
public class DoubleCheckSingletonTest extends SingletonTest<DoubleCheckSingleton> {

    public DoubleCheckSingletonTest() {
        super(DoubleCheckSingleton::getInstance);
    }
}
