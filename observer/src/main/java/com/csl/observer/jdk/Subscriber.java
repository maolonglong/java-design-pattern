package com.csl.observer.jdk;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:29
 */
@Slf4j
public class Subscriber implements Observer {

    @Override
    public void update(Observable publisher, Object msg) {
        LOGGER.info("来自 {} 的消息: {}", publisher, msg);
    }
}
