package com.csl.strategy;

import com.csl.factory.OperationFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MaoLongLong
 * @date 2021-03-17 17:23:19
 */
public class OperationContextTest {

    @Test
    void testOperationContext() {
        var ctx = new OperationContext(OperationFactory.createOperation('+'));
        assertEquals(3, ctx.executeStrategy(1, 2));

        ctx.changeStrategy(OperationFactory.createOperation('-'));
        assertEquals(2, ctx.executeStrategy(5, 3));

        ctx.changeStrategy(OperationFactory.createOperation('*'));
        assertEquals(4.5, ctx.executeStrategy(3, 1.5));

        ctx.changeStrategy(OperationFactory.createOperation('/'));
        assertEquals(2.5, ctx.executeStrategy(5, 2));
    }
}
