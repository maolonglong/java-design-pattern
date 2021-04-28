package com.csl.visitor;

/**
 * @author MaoLongLong
 * @date 2021-04-28 19:58
 */
public class Sergeant extends Unit {

    public Sergeant(Unit... children) {
        super(children);
    }

    @Override
    public String toString() {
        return "sergeant";
    }
}
