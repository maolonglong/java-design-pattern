package com.csl.strategy.function;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author MaoLongLong
 */
class ValidatorTest {

    @Test
    void testLowerCaseValidator() {
        Validator validator = new Validator(ValidationStrategy.LOWER_CASE);
        assertTrue(validator.validate("abc"));
        assertFalse(validator.validate("ABC"));
    }

    @Test
    void testUpperCaseValidator() {
        Validator validator = new Validator(ValidationStrategy.UPPER_CASE);
        assertFalse(validator.validate("abc"));
        assertTrue(validator.validate("ABC"));
    }

    @Test
    void testNumericValidator() {
        Validator validator = new Validator(ValidationStrategy.NUMERIC);
        assertFalse(validator.validate("abc"));
        assertTrue(validator.validate("123"));
    }

    @Test
    void testLetterValidator() {
        Validator validator = new Validator(ValidationStrategy.LETTER);
        assertFalse(validator.validate("123"));
        assertTrue(validator.validate("aBc"));
    }

    @Test
    void testCompositeValidator() {

        Predicate<String> compositeStrategy =
            ValidationStrategy.LOWER_CASE.or(ValidationStrategy.NUMERIC);

        Validator validator = new Validator(compositeStrategy);
        assertTrue(validator.validate("123"));
        assertTrue(validator.validate("abc"));
        assertFalse(validator.validate("ABC"));
    }
}
