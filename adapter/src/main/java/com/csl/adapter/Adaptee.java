package com.csl.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 * @date 2021/4/28 上午12:20
 */
@Slf4j
public class Adaptee {

    public void specificRequest() {
        LOGGER.info("特殊请求");
    }
}
