package com.dothings.training.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dothings.training.domain.MessageException;
import com.dothings.training.domain.Status;

/**
 * 全局的的异常拦截器（拦截所有的控制器）
 * @author ganpeikang
 *
 */
@ControllerAdvice
@Order(200)
public class MessageExceptionHandler {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 拦截业务异常
     *
     */
    @ExceptionHandler(MessageException.class)
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Status notFount(MessageException e) {
        log.info("业务异常:", e);
        return e.getModel();
    }

    /**
     * 拦截未知的运行时异常
     *
     */
    @ExceptionHandler(Exception.class)
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Status notFount(Exception e) {
        log.error("运行时异常:", e);
        return new MessageException(500, e.getMessage(), e.getStackTrace()).getModel();
    }

}
