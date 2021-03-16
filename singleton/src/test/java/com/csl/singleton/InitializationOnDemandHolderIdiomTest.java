package com.csl.singleton;

/**
 * @author MaoLongLong
 * @date 2021-03-16 23:18:15
 */
public class InitializationOnDemandHolderIdiomTest
        extends SingletonTest<InitializationOnDemandHolderIdiom> {

    public InitializationOnDemandHolderIdiomTest() {
        super(InitializationOnDemandHolderIdiom::getInstance);
    }
}
