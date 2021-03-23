package com.csl.chain;

/**
 * @author MaoLongLong
 */
public class FileLogger extends AbstractLogger {

    private final String filename;

    public FileLogger(Level level, String filename) {
        super(level);
        this.filename = filename;
    }

    @Override
    protected void write(String message) {
        System.out.println("File[" + filename + "]: " + message);
    }
}
