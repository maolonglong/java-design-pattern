package com.csl.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 * @date 2021-03-15 14:34:30
 */
class CommandTest {

    @Test
    void testCommand() {
        assertDoesNotThrow(() -> {
            Receiver receiver = new Receiver();
            Command commandOne = new ConcreteCommandOne(receiver);
            Command commandTwo = new ConcreteCommandTwo(receiver);
            Invoker invoker = new Invoker(commandOne, commandTwo);
            invoker.actionOne();
            invoker.actionTwo();
        });
    }
}
