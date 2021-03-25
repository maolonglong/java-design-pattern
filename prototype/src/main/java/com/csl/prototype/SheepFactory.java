package com.csl.prototype;

import lombok.RequiredArgsConstructor;

/**
 * @author MaoLongLong
 */
@RequiredArgsConstructor
public class SheepFactory {

    private final Sheep sheep;

    public Sheep createSheep() {
        return sheep.copy();
    }
}
