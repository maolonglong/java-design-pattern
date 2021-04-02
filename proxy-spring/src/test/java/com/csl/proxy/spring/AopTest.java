package com.csl.proxy.spring;

import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONUtil;
import com.csl.proxy.spring.dto.LoginParam;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author MaoLongLong
 */
@SpringBootTest
@AutoConfigureMockMvc
class AopTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testLoginSuccess() throws Exception {

        LoginParam param = new LoginParam();
        param.setUsername("root");
        param.setPassword("123456");
        String body = JSONUtil.toJsonStr(param);

        String expected = JSONUtil.toJsonStr(Dict.create()
            .set("code", 200)
            .set("msg", "登录成功"));

        mockMvc.perform(post("/login")
            .contentType(MediaType.APPLICATION_JSON)
            .content(body))
            .andExpect(status().isOk())
            .andExpect(content().json(expected));
    }

    @Test
    void testLoginFailure() throws Exception {

        LoginParam param = new LoginParam();
        param.setUsername("root");
        param.setPassword("xxx");
        String body = JSONUtil.toJsonStr(param);

        String expected = JSONUtil.toJsonStr(Dict.create()
            .set("code", 400)
            .set("msg", "登录失败"));

        mockMvc.perform(post("/login")
            .contentType(MediaType.APPLICATION_JSON)
            .content(body))
            .andExpect(status().isOk())
            .andExpect(content().json(expected));
    }
}
