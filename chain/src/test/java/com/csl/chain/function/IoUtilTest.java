package com.csl.chain.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author MaoLongLong
 */
class IoUtilTest {

    @Test
    void testParsePrettyArray() {
        int[] array = IoUtil.parsePrettyArray("[1, 23, 456]");
        assertArrayEquals(new int[]{1, 23, 456}, array);
    }
}
