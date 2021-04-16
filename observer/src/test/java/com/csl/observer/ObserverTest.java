package com.csl.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:23
 */
class ObserverTest {

    @Test
    void testObserver() {
        assertDoesNotThrow(() -> {
            ConcreteSubject s = new ConcreteSubject();
            s.attach(new ConcreteObserver(s, "A"));
            s.attach(new ConcreteObserver(s, "B"));
            s.attach(new ConcreteObserver(s, "C"));
            s.setState("ABC");
            s.notifyObservers();
        });
    }
}
