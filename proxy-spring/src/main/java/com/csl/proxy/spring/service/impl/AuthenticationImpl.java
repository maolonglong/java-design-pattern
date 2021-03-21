package com.csl.proxy.spring.service.impl;

import com.csl.proxy.spring.dto.LoginParam;
import com.csl.proxy.spring.service.AuthenticationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author MaoLongLong
 */
@Slf4j
@Service
public class AuthenticationImpl implements AuthenticationService {

    @Override
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public boolean login(LoginParam param) {
        return "root".equals(param.getUsername())
            && "123456".equals(param.getPassword());
    }
}
