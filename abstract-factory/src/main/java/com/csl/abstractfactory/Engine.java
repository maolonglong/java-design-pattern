package com.csl.abstractfactory;

/**
 * @author MaoLongLong
 * @date 2021-03-18 16:48:15
 */
public interface Engine {

    /**
     * 不同的引擎返回不同的描述信息
     *
     * @return 描述信息
     */
    String getDescription();
}
