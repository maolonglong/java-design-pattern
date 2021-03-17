package com.csl.factory;

/**
 * @author MaoLongLong
 * @date 2021-03-17 14:29:41
 */
public interface Operation {

    /**
     * 抽象加减乘除运算
     *
     * @param x 运算数
     * @param y 运算数
     * @return 运算结果
     */
    int doOperation(int x, int y);
}
