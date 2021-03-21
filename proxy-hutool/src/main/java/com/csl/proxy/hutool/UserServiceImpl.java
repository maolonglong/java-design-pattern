package com.csl.proxy.hutool;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MaoLongLong
 */
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public User save(User user) {
        LOGGER.info("保存用户: {}", user);
        return user;
    }
}
