package com.csl.proxy.hutool;

import cn.hutool.aop.aspects.SimpleAspect;
import cn.hutool.core.util.ObjectUtil;

import java.lang.reflect.Method;

/**
 * @author MaoLongLong
 */
public class UserServiceAspect extends SimpleAspect {

    /**
     * 假设现在的需求是，删除用户传入的 id，因为数据库已经提供了自增 id
     */
    @Override
    public boolean before(Object target, Method method, Object[] args) {
        User user = (User) args[0];
        if (ObjectUtil.isNotNull(user.getId())) {
            user.setId(null);
        }
        return true;
    }
}
