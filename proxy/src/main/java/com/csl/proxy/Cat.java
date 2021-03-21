package com.csl.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 */
@Slf4j
public class Cat implements Animal {

    @Override
    public void eat() {
        LOGGER.info("吃猫粮");
    }

    @Override
    public void call() {
        LOGGER.info("喵喵喵");
    }
}
