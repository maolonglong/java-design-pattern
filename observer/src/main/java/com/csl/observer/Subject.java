package com.csl.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MaoLongLong
 * @date 2021-04-17 0:06
 */
public abstract class Subject {

    private final List<Observer> obs = new ArrayList<>();

    public void attach(Observer ob) {
        obs.add(ob);
    }

    public void detach(Observer ob) {
        obs.remove(ob);
    }

    public void notifyObservers() {
        for (Observer ob : obs) {
            ob.update();
        }
    }
}
