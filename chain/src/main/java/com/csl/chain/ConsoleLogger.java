package com.csl.chain;

/**
 * @author MaoLongLong
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(Level level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Console: " + message);
    }
}
