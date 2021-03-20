package com.csl.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 */
@Slf4j
public class ConcreteDecoratorOne extends Decorator {

    @Override
    public void operation() {
        super.operation();
        LOGGER.info("具体装饰对象 One 的操作");
    }
}
