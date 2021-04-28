package com.csl.visitor;

/**
 * @author MaoLongLong
 * @date 2021-04-28 19:55
 */
public class Commander extends Unit {

    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public String toString() {
        return "commander";
    }
}
