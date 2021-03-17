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
        assertEquals(3, operation.doOperation(1, 2));

        operation = OperationFactory.createOperation('-');
        assertEquals(3, operation.doOperation(5, 2));

        operation = OperationFactory.createOperation('*');
        assertEquals(6, operation.doOperation(2, 3));

        operation = OperationFactory.createOperation('/');
        assertEquals(2, operation.doOperation(5, 2));
    }
}
