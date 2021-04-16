package com.csl.observer.jdk;

import java.util.Observable;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:26
 */
public class Publisher extends Observable {

    public void publish(Object msg) {
        setChanged();
        notifyObservers(msg);
    }
}
