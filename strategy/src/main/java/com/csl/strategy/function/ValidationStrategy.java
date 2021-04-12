package com.csl.strategy.function;

import java.util.function.Predicate;

/**
 * @author MaoLongLong
 */
public interface ValidationStrategy extends Predicate<String> {

    ValidationStrategy LOWER_CASE = s -> s.matches("[a-z]+");

    ValidationStrategy UPPER_CASE = s -> s.matches("[A-Z]+");

    ValidationStrategy NUMERIC = s -> s.matches("\\d+");

    ValidationStrategy LETTER = s -> s.matches("[a-zA-Z]+");
}
