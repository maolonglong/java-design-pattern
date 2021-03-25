package com.csl.prototype;

import lombok.RequiredArgsConstructor;

/**
 * @author MaoLongLong
 */
@RequiredArgsConstructor
public class DollySheep extends Sheep {

    private final String dna;

    public DollySheep(DollySheep source) {
        super(source);
        this.dna = source.dna;
    }

    @Override
    public DollySheep copy() {
        return new DollySheep(this);
    }

    @Override
    public String toString() {
        return dna;
    }
}
