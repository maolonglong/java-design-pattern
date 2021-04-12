package com.csl.strategy.function;

import java.util.function.Predicate;

/**
 * @author MaoLongLong
 */
public class Validator {

    private final Predicate<String> strategy;

    public Validator(Predicate<String> strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s) {
        return strategy.test(s);
    }
}
