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
        assertEquals(1, ctx.executeStrategy(4, 3));

        ctx.changeStrategy(OperationFactory.createOperation('*'));
        assertEquals(6, ctx.executeStrategy(2, 3));

        ctx.changeStrategy(OperationFactory.createOperation('/'));
        assertEquals(3, ctx.executeStrategy(9, 3));
    }
}
