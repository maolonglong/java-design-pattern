package com.csl.proxy;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author MaoLongLong
 */
@Slf4j
public class CglibProxy {

    private CglibProxy() {
    }

    public static Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback((MethodInterceptor) (o, method, args, proxy) -> {
            LOGGER.info("{}.{} 之前", o.getClass().getSimpleName(), method.getName());
            Object ret = proxy.invokeSuper(o, args);
            LOGGER.info("{}.{} 之后", o.getClass().getSimpleName(), method.getName());
            return ret;
        });
        return enhancer.create();
    }
}
