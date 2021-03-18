package com.csl.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MaoLongLong
 * @date 2021-03-18 17:00:35
 */
public class AbstractFactoryTest {

    @Test
    void testAbstractFactory() {
        CarFactory factory = new CarFactoryBuilder(CarType.Audi).build();
        assertEquals("Audi engine", factory.createEngine().getDescription());
        assertEquals("Audi wheel", factory.createWheel().getDescription());

        factory = new CarFactoryBuilder(CarType.Benz).build();
        assertEquals("Benz engine", factory.createEngine().getDescription());
        assertEquals("Benz wheel", factory.createWheel().getDescription());
    }
}
