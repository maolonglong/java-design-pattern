package com.csl.abstractfactory;

/**
 * @author MaoLongLong
 * @date 2021-03-18 16:52:01
 */
public class AudiFactory implements CarFactory {

    @Override
    public Wheel createWheel() {
        return new AudiWheel();
    }

    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }
}
