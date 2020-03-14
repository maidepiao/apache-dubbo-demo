package com.star.demo.service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.star.demo.common.Result;
import com.star.demo.pojo.User;
import com.star.demo.service.HelloService;
import org.apache.dubbo.common.json.JSON;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @ClassName HelloServiceImpl
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 18:14
 * @ModifyDate 2020/2/19 18:14
 * @Version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHelloStr(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello "+name+" "+RpcContext.getContext().getAttachment("tester");
    }

    @Override
    public Result<String> sayHelloObj(User user) {
        Result<String> result = new Result<>();
        result.setCode("0");
        Gson gson = new Gson();
        result.setData(gson.toJson(user));
        return result;
    }
}
