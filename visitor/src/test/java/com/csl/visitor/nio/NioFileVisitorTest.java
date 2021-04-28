package com.csl.visitor.nio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021-04-28 20:22
 */
class NioFileVisitorTest {

    @Test
    void testNioFileVisitor() {
        assertDoesNotThrow(() -> NioFileVisitor.main(new String[]{}));
    }
}
