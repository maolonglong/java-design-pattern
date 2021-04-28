package com.csl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021-04-28 20:06
 */
class AppTest {

    @Test
    void testApp() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
