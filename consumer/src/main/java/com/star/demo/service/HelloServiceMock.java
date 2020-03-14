package com.star.demo.service;

import com.star.demo.common.Result;
import com.star.demo.pojo.User;
import com.star.demo.service.HelloService;

/**
 * @ClassName HelloServiceMock
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 21:14
 * @ModifyDate 2020/2/19 21:14
 * @Version 1.0
 */
public class HelloServiceMock implements HelloService {
    @Override
    public String sayHelloStr(String name) {
        return "mock " + name;
    }

    @Override
    public Result<String> sayHelloObj(User user) {
        return null;
    }
}
