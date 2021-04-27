package com.csl.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021/4/28 上午12:23
 */
class AdapterTest {

    @Test
    void testAdapter() {
        assertDoesNotThrow(() -> {
            Adaptee adaptee = new Adaptee();
            Target target = new Adapter(adaptee);
            new Client().consume(target);
        });
    }
}
