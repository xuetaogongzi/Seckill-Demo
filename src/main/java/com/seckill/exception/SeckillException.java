package com.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created by wangjw on 16/11/30.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

}
