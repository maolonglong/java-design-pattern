package com.csl.factory;

/**
 * @author MaoLongLong
 * @date 2021-03-17 14:34:05
 */
public class OperationFactory {

    private OperationFactory() {
    }

    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public static Operation createOperation(char op) {
        if (op == '+') {
            return new OperationAdd();
        }
        if (op == '-') {
            return new OperationSub();
        }
        if (op == '*') {
            return new OperationMul();
        }
        // if op == '/'
        return new OperationDiv();
    }
}
