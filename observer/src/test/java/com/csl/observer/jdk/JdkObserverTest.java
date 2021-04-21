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
            Publisher p1 = new Publisher();
            Publisher p2 = new Publisher();

            // multi-subscribe
            Subscriber subscriber = new Subscriber();
            p1.addObserver(subscriber);
            p2.addObserver(subscriber);

            p1.publish("Hello");
            p2.publish("World");
        });
    }
}
