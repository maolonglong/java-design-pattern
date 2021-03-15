package com.csl.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 * @date 2021-03-15 14:25:42
 */
@Slf4j
public class Receiver {

    public void actionOne() {
        LOGGER.info("ActionOne has been taken.");
    }

    public void actionTwo() {
        LOGGER.info("ActionTwo has been taken.");
    }
}
