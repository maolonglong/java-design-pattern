package com.csl.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 */
@Slf4j
public class RealSubject implements Subject {

    @Override
    public void request() {
        LOGGER.info("真实的请求");
    }
}
