package com.csl.observer.future;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:57
 */
class CompletableFutureTest {

    @Test
    void testCompletableFuture() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
