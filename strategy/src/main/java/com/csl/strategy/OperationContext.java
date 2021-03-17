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

    public double executeStrategy(double numberA, double numberB) {
        strategy.setNumberA(numberA);
        strategy.setNumberB(numberB);
        return strategy.getResult();
    }
}
