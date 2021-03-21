package com.csl.proxy.spring.service;

import com.csl.proxy.spring.dto.LoginParam;

/**
 * @author MaoLongLong
 */
public interface LoginService {

    /**
     * 模拟登录操作
     *
     * @param param 登录参数
     * @return 登录是否成功
     */
    boolean login(LoginParam param);
}
