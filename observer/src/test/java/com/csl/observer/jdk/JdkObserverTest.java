package com.csl.observer.jdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:31
 */
class JdkObserverTest {

    @Test
    void testJdkObserver() {
        assertDoesNotThrow(() -> {
            Publisher publisher = new Publisher();
            Subscriber subscriber = new Subscriber();
            publisher.addObserver(subscriber);
            publisher.publish("Hello Observer");
        });
    }
}
