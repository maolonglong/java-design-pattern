package com.csl.prototype;

import lombok.NoArgsConstructor;

/**
 * @author MaoLongLong
 */
@NoArgsConstructor
public abstract class Sheep implements Prototype {

    public Sheep(Sheep source) {
    }

    @Override
    public abstract Sheep copy();
}
