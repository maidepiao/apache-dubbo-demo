package com.star.demo.service;

import com.star.demo.common.Result;
import com.star.demo.pojo.User;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 15:38
 * @ModifyDate 2020/2/19 15:38
 * @Version 1.0
 */
public interface HelloService {

    String sayHelloStr(String name);

    Result<String> sayHelloObj(User user);
}
