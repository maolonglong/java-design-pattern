package com.csl.proxy;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 */
@Slf4j
public class SubjectProxy implements Subject {

    private static final int REQUEST_MAX_COUNT = 3;

    private final Subject subject;

    private int count;

    public SubjectProxy(@NonNull Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        if (count < REQUEST_MAX_COUNT) {
            subject.request();
            count++;
        } else {
            LOGGER.info("超出请求次数限制");
        }
    }
}
