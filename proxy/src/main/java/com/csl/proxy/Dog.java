package com.csl.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 不是我忘记实现 Animal 了，是故意的，用来测试 Cglib
 *
 * @author MaoLongLong
 */
@Slf4j
public class Dog {

    public void eat() {
        LOGGER.info("吃狗粮");
    }

    public void call() {
        LOGGER.info("汪汪汪");
    }
}
