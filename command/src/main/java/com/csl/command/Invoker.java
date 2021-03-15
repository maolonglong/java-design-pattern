package com.csl.command;

import lombok.Setter;

/**
 * @author MaoLongLong
 * @date 2021-03-15 14:30:50
 */
public class Invoker {

    @Setter
    private Command command;

    public void startExecuteCommand() {
        command.execute();
    }
}
