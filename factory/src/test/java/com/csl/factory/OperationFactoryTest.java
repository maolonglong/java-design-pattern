package com.csl.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MaoLongLong
 * @date 2021-03-17 14:38:10
 */
public class OperationFactoryTest {

    @Test
    void testOperationFactory() {
        testOperation(3, 1, '+', 2);
        testOperation(2, 5, '-', 3);
        testOperation(4.5, 3, '*', 1.5);
        testOperation(2.5, 5, '/', 2);
    }

    void testOperation(double expected, double numberA, char op, double numberB) {
        Operation operation = OperationFactory.createOperation(op);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        assertEquals(expected, operation.getResult());
    }
}
