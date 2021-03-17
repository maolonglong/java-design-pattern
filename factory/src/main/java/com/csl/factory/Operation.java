package com.csl.factory;

import lombok.Setter;

/**
 * @author MaoLongLong
 * @date 2021-03-17 14:29:41
 */
@Setter
public abstract class Operation {

    protected double numberA;

    protected double numberB;

    public abstract double getResult();
}
