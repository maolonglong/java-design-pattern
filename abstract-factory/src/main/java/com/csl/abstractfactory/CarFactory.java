package com.csl.abstractfactory;

/**
 * @author MaoLongLong
 * @date 2021-03-18 16:43:52
 */
public interface CarFactory {

    /**
     * 创建轮子
     *
     * @return 抽象轮子
     */
    Wheel createWheel();

    /**
     * 创建引擎
     *
     * @return 抽象引擎
     */
    Engine createEngine();
}
