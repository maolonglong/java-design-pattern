package com.csl.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 */
@Slf4j
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        LOGGER.info("具体对象操作");
    }
}
