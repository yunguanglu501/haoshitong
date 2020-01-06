package com.wanbang.youyibang.common.exception;

import com.wanbang.youyibang.common.entity.ReturnCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author shixiangweii
 * @date 2019/8/25 12:12
 */
@Getter
@Setter
public class BusinessException extends RuntimeException {
    private String code;
    private String msg;
    private Object data;

    public BusinessException(ReturnCode error) {
        this.code = error.val();
        this.msg = error.msg();
    }
}
