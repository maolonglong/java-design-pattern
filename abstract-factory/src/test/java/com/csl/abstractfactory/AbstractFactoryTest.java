package com.csl.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MaoLongLong
 * @date 2021-03-18 17:00:35
 */
class AbstractFactoryTest {

    @Test
    void testAbstractFactory() {
        CarFactory factory = new CarFactoryBuilder(CarType.AUDI).build();
        assertEquals("Audi engine", factory.createEngine().getDescription());
        assertEquals("Audi wheel", factory.createWheel().getDescription());

        factory = new CarFactoryBuilder(CarType.BENZ).build();
        assertEquals("Benz engine", factory.createEngine().getDescription());
        assertEquals("Benz wheel", factory.createWheel().getDescription());
    }
}
