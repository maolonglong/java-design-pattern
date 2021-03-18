package com.csl.factory.method;

import com.csl.factory.Operation;
import com.csl.factory.OperationMul;

/**
 * @author MaoLongLong
 * @date 2021-03-18 15:56:00
 */
public class MulFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
