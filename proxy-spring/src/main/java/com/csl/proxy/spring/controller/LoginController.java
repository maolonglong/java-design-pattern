package com.csl.proxy.spring.controller;

import cn.hutool.core.lang.Dict;
import com.csl.proxy.spring.dto.LoginParam;
import com.csl.proxy.spring.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaoLongLong
 */
@RestController
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public Dict login(@RequestBody LoginParam param) {
        Dict dict = Dict.create();
        if (service.login(param)) {
            dict.set("code", 200).set("msg", "登录成功");
        } else {
            dict.set("code", 400).set("msg", "登录失败");
        }
        return dict;
    }
}
