package com.csl.proxy.spring;

import com.csl.proxy.spring.dto.LoginParam;
import com.csl.proxy.spring.service.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author MaoLongLong
 */
@SpringBootTest
class AopTest {

    @Autowired
    LoginService service;

    @Test
    void testAop() {
        LoginParam param = new LoginParam();

        param.setUsername("root");
        param.setPassword("123456");
        assertTrue(service.login(param));

        param.setUsername("xxx");
        param.setPassword("12");
        assertFalse(service.login(param));
    }
}
