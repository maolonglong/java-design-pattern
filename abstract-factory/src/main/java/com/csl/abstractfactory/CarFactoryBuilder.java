package com.csl.abstractfactory;

/**
 * @author MaoLongLong
 * @date 2021-03-18 16:55:14
 */
public class CarFactoryBuilder {

    private final CarType type;

    public CarFactoryBuilder(CarType type) {
        this.type = type;
    }

    public CarFactory build() {
        switch (type) {
            case Audi:
                return new AudiFactory();
            case Benz:
                return new BenzFactory();
            default:
                throw new IllegalArgumentException("unknown type: " + type);
        }
    }
}
