package com.csl.chain;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 */
@Slf4j
public abstract class AbstractLogger {

    protected final Level level;

    @Setter
    protected AbstractLogger next;

    public AbstractLogger(Level level) {
        this.level = level;
    }

    public void log(Level level, String message) {
        if (this.level.compareTo(level) <= 0) {
            write(message);
        }
        if (next != null) {
            next.log(level, message);
        }
    }

    /**
     * 由具体实现类完成写日志逻辑
     *
     * @param message 日志信息
     */
     protected abstract void write(String message);
}
