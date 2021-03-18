package com.csl.abstractfactory;

/**
 * @author MaoLongLong
 * @date 2021-03-18 16:43:52
 */
public interface CarFactory {

    Wheel createWheel();

    Engine createEngine();
}
