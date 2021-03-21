package com.csl.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * @author MaoLongLong
 */
@Slf4j
public class JdkProxy {

    private JdkProxy() {
    }

    public static Object getInstance(Object o) {
        Class<?> clazz = o.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
            (proxy, method, args) -> {
                LOGGER.info("{}.{} 之前", clazz.getSimpleName(), method.getName());
                Object ret = method.invoke(o, args);
                LOGGER.info("{}.{} 之后", clazz.getSimpleName(), method.getName());
                return ret;
            });
    }
}
