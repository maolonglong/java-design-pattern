package com.csl.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 * @date 2021-04-28 20:00
 */
@Slf4j
public class SoldierVisitor implements UnitVisitor {

    @Override
    public void visit(Unit unit) {
        if (unit instanceof Soldier) {
            LOGGER.info("Greetings {}", unit);
        }
    }
}
