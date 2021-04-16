package com.csl.observer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:16
 */
@Slf4j
@RequiredArgsConstructor
public class ConcreteObserver implements Observer {

    private final ConcreteSubject subject;

    private final String name;

    @Override
    public void update() {
        LOGGER.info("观察者 {} 的新状态是 {}", name, subject.getState());
    }
}
