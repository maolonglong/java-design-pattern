package com.csl.strategy;

import com.csl.factory.Operation;

/**
 * @author MaoLongLong
 * @date 2021-03-17 17:21:03
 */
public class OperationContext {

    private Operation strategy;

    public OperationContext(Operation initializeStrategy) {
        this.strategy = initializeStrategy;
    }

    public void changeStrategy(Operation strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y) {
        return strategy.doOperation(x, y);
    }
}
