package com.csl.command;

import org.junit.jupiter.api.Test;

/**
 * @author MaoLongLong
 * @date 2021-03-15 14:34:30
 */
public class CommandTest {

    @Test
    void testCommand() {
        var receiver = new Receiver();
        var commandOne = new ConcreteCommandOne(receiver);
        var commandTwo = new ConcreteCommandTwo(receiver);
        var invoker = new Invoker(commandOne, commandTwo);
        invoker.actionOne();
        invoker.actionTwo();
    }
}
