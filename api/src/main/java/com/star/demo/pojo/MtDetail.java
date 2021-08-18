package com.star.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: apache-dubbo-demo
 * @description: 发送明细
 * @author: star.hu
 * @create: 2021-08-18 14:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MtDetail {


    private long id;
    private String content;
}