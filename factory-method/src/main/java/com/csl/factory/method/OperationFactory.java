package com.csl.factory.method;

import com.csl.factory.Operation;

/**
 * @author MaoLongLong
 * @date 2021-03-18 15:55:33
 */
public interface OperationFactory {

    /**
     * 实现类决定要返回什么具体对象
     *
     * @return Operation 的实现类
     */
    Operation createOperation();
}
