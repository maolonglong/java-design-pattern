package com.csl.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 * @date 2021-04-28 19:59
 */
@Slf4j
public class SergeantVisitor implements UnitVisitor {

    @Override
    public void visit(Unit unit) {
        if (unit instanceof Sergeant) {
            LOGGER.info("Hello {}", unit);
        }
    }
}
