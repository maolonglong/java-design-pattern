package com.csl.factory.method;

import com.csl.factory.Operation;
import com.csl.factory.OperationSub;

/**
 * @author MaoLongLong
 * @date 2021-03-18 15:56:00
 */
public class SubFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
