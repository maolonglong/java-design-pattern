package com.csl.command;

/**
 * @author MaoLongLong
 * @date 2021-03-15 14:30:50
 */
public class Invoker {

    private final Command commandOne;
    private final Command commandTwo;

    public Invoker(Command commandOne, Command commandTwo) {
        this.commandOne = commandOne;
        this.commandTwo = commandTwo;
    }

    public void actionOne() {
        commandOne.execute();
    }

    public void actionTwo() {
        commandTwo.execute();
    }
}
