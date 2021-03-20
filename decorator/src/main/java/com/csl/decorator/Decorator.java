package com.csl.decorator;

import lombok.Setter;

/**
 * @author MaoLongLong
 */
public abstract class Decorator extends Component {

    @Setter
    protected Component component;

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
