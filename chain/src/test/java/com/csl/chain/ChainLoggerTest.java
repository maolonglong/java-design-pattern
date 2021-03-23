package com.csl.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 */
class ChainLoggerTest {

    @Test
    void testChainLogger() {
        assertDoesNotThrow(() -> {
            // 模拟业务逻辑:
            // trace 级别不显示
            // debug 级别仅在控制台显示
            // info 及以上, 同时在控制台和文件显示
            // error 额外存一份文件
            AbstractLogger log = new ConsoleLogger(Level.DEBUG);
            AbstractLogger infoFile = new FileLogger(Level.INFO, "info.log");
            AbstractLogger errorFile = new FileLogger(Level.ERROR, "error.log");

            log.setNext(infoFile);
            infoFile.setNext(errorFile);

            log.log(Level.TRACE, "TRACE");
            log.log(Level.DEBUG, "DEBUG");

            log.log(Level.INFO, "INFO");
            log.log(Level.WARN, "WARN");

            log.log(Level.ERROR, "ERROR");
        });
    }
}
