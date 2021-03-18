package com.csl.abstractfactory;

/**
 * @author MaoLongLong
 * @date 2021-03-18 16:52:09
 */
public class BenzFactory implements CarFactory {

    @Override
    public Wheel createWheel() {
        return new BenzWheel();
    }

    @Override
    public Engine createEngine() {
        return new BenzEngine();
    }
}
