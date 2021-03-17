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
        var operation = OperationFactory.createOperation('+');
        operation.setNumberA(1);
        operation.setNumberB(2);
        assertEquals(3, operation.getResult());

        operation = OperationFactory.createOperation('-');
        operation.setNumberA(5.2);
        operation.setNumberB(2.1);
        assertEquals(3.1, operation.getResult());

        operation = OperationFactory.createOperation('*');
        operation.setNumberA(1.5);
        operation.setNumberB(3);
        assertEquals(4.5, operation.getResult());

        operation = OperationFactory.createOperation('/');
        operation.setNumberA(5);
        operation.setNumberB(2);
        assertEquals(2.5, operation.getResult());
    }
}
