package com.csl.factory.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author MaoLongLong
 */
class ProductFactoryTest {

    @Test
    void testProductFactory() {

        assertTrue(ProductFactory.createProduct("loan") instanceof Loan);
        assertTrue(ProductFactory.createProduct("stock") instanceof Stock);
        assertTrue(ProductFactory.createProduct("bond") instanceof Bond);

        assertThrows(IllegalArgumentException.class, () -> ProductFactory.createProduct("apple"));
    }
}
