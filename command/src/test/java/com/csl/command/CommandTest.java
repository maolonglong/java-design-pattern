package com.csl.command;

import org.junit.jupiter.api.Test;

/**
 * @author MaoLongLong
 * @date 2021-03-15 14:34:30
 */
public class CommandTest {

    @Test
    void testCommand() {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand(new Receiver()));
        invoker.startExecuteCommand();
    }
}
