package com.star.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: apache-dubbo-demo
 * @description: 订单
 * @author: star.hu
 * @create: 2021-08-18 14:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private long id;
    private double amount;
}