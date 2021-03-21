package com.csl.proxy.spring.aspect;

import com.csl.proxy.spring.dto.LoginParam;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 记录登录日志
 *
 * @author MaoLongLong
 */
@Aspect
@Component
@Slf4j
public class LoginLogAspect {

    @Pointcut("execution(public * com.csl.proxy.spring.service.impl.LoginServiceImpl.login(..))")
    public void pointcut() {
        // define pointcut
    }

    @AfterReturning(value = "pointcut()", returning = "ok")
    public void afterReturning(JoinPoint point, boolean ok) {
        LoginParam param = (LoginParam) point.getArgs()[0];
        String username = param.getUsername();
        if (ok) {
            LOGGER.info("{} 登录成功", username);
        } else {
            LOGGER.info("{} 登录失败", username);
        }
    }
}
