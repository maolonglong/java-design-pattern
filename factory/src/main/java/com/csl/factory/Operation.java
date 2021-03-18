package com.csl.factory;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MaoLongLong
 * @date 2021-03-17 14:29:41
 */
@Getter
@Setter
@SuppressWarnings("AlibabaAbstractClassShouldStartWithAbstractNaming")
public abstract class Operation {

    private double numberA;

    private double numberB;

    /**
     * 抽象了加减乘除运算
     *
     * @return 计算结果
     */
    public abstract double getResult();
}
