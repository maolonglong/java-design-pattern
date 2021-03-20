package com.csl.factory.method;

import com.csl.factory.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MaoLongLong
 * @date 2021-03-18 15:57:47
 */
class OperationFactoryTest {

    @Test
    void testOperationFactory() {
        OperationFactory factory = new AddFactory();
        testOperation(3, 1, 2, factory.createOperation());

        factory = new SubFactory();
        testOperation(2, 5, 3, factory.createOperation());

        factory = new MulFactory();
        testOperation(4.5, 3, 1.5, factory.createOperation());

        factory = new DivFactory();
        testOperation(2.5, 5, 2, factory.createOperation());
    }

    void testOperation(double expected, double numberA, double numberB, Operation operation) {
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        assertEquals(expected, operation.getResult());
    }
}
