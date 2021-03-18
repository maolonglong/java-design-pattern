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
        switch (op) {
            case '+':
                return new OperationAdd();
            case '-':
                return new OperationSub();
            case '*':
                return new OperationMul();
            case '/':
                return new OperationDiv();
            default:
                throw new IllegalArgumentException("unknown op: " + op);
        }
    }
}
