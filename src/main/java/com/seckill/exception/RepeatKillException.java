package com.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 * Created by wangjw on 16/11/30.
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }

}
