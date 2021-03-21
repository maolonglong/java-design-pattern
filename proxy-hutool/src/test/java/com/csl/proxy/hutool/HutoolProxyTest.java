package com.csl.proxy.hutool;

import cn.hutool.aop.ProxyUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author MaoLongLong
 */
class HutoolProxyTest {

    @Test
    void testHutoolProxy() {
        UserService service = ProxyUtil.proxy(new UserServiceImpl(), UserServiceAspect.class);
        User user = new User();
        user.setId(123);
        user.setUsername("root");
        user.setPassword("123456");
        assertNull(service.save(user).getId());
    }
}
