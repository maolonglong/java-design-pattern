package com.csl.factory;

/**
 * @author MaoLongLong
 * @date 2021-03-17 14:31:59
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
