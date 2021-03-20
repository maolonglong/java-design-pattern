package com.csl.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 */
class DecoratorTest {

    @Test
    void testDecorator() {
        assertDoesNotThrow(() -> {
            Component c = new ConcreteComponent();
            Decorator d1 = new ConcreteDecoratorOne();
            Decorator d2 = new ConcreteDecoratorTwo();

            d1.setComponent(c);
            d2.setComponent(d1);

            d2.operation();
        });
    }
}
