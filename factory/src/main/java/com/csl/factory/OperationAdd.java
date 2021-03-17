package com.csl.factory;

/**
 * @author MaoLongLong
 * @date 2021-03-17 14:31:59
 */
public class OperationAdd implements Operation {

    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }
}
