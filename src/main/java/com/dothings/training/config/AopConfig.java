package com.dothings.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.dothings.training.base.MessageExceptionHandler;


@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    /**
     * 默认的异常拦截器
     */
    @Bean
    public MessageExceptionHandler defaultControllerExceptionHandler() {
        return new MessageExceptionHandler();
    }

}