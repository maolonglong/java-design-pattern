package com.csl.command;

/**
 * @author MaoLongLong
 * @date 2021-03-15 14:29:52
 */
public class ConcreteCommand implements Command {

    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sayHello();
    }
}
