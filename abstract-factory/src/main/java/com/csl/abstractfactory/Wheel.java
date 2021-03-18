package com.csl.abstractfactory;

/**
 * @author MaoLongLong
 * @date 2021-03-18 16:45:03
 */
public interface Wheel {

    /**
     * 不同的引擎返回不同的描述信息
     *
     * @return 描述信息
     */
    String getDescription();
}
