package com.wanbang.youyibang.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Description:
 * User: shixiangweii
 * Date: 2018-11-24
 * Time: 22:12
 *
 * @author shixiangweii
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class HttpResult {
    private Integer code;
    private String data;
}
