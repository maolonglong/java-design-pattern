package com.csl.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 * @date 2021-04-28 19:55
 */
@Slf4j
public class CommanderVisitor implements UnitVisitor {

    @Override
    public void visit(Unit unit) {
        if (unit instanceof Commander) {
            LOGGER.info("Good to see you {}", unit);
        }
    }
}
