package com.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by wangjw on 16/11/30.
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }

}
