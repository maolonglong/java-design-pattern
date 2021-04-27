package com.csl.adapter;

import lombok.RequiredArgsConstructor;

/**
 * @author MaoLongLong
 * @date 2021/4/28 上午12:21
 */
@RequiredArgsConstructor
public class Adapter implements Target {

    private final Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
