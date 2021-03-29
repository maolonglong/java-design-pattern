package com.csl.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author MaoLongLong
 */
@Slf4j
class BuilderTest {

    @Test
    void testBuilder() {

        Student s = Student.builder()
            .id(123)
            // .name("csl")
            .age(20)
            .build();

        LOGGER.info(s.toString());

        assertEquals(123, s.getId());
        // assertEquals("csl", s.getName());
        assertNull(s.getName());
        assertEquals(20, s.getAge());
    }
}
