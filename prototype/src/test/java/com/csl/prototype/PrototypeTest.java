package com.csl.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * @author MaoLongLong
 */
class PrototypeTest {

    @Test
    void testPrototype() {
        Sheep prototype = new DollySheep("xxx");
        SheepFactory factory = new SheepFactory(prototype);

        Sheep s1 = factory.createSheep();
        Sheep s2 = factory.createSheep();

        assertEquals("xxx", s1.toString());
        assertEquals("xxx", s2.toString());
        assertNotSame(s1, s2);
    }
}
