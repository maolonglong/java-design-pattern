package com.csl.visitor;

/**
 * @author MaoLongLong
 * @date 2021-04-28 20:00
 */
public class Soldier extends Unit {

    public Soldier(Unit... children) {
        super(children);
    }

    @Override
    public String toString() {
        return "soldier";
    }
}
