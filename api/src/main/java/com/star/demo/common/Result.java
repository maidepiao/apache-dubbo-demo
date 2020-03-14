package com.star.demo.common;

import lombok.Data;

/**
 * @ClassName Result
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 15:43
 * @ModifyDate 2020/2/19 15:43
 * @Version 1.0
 */
@Data
public class Result<T> {

    private String code;
    private String msg;
    private T data;
}
