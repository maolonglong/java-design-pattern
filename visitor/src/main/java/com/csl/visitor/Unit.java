package com.csl.visitor;

/**
 * @author MaoLongLong
 * @date 2021-04-28 19:49
 */
public abstract class Unit {

    private final Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        for (Unit child : children) {
            child.accept(visitor);
        }
    }
}
