package com.csl.observer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:13
 */
public class ConcreteSubject extends Subject {

    @Getter
    @Setter
    private String state;
}
