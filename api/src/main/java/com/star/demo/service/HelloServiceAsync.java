package com.star.demo.service;

import java.util.concurrent.CompletableFuture;

/**
 * @ClassName HelloServiceAsync
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 15:46
 * @ModifyDate 2020/2/19 15:46
 * @Version 1.0
 */
public interface HelloServiceAsync {

    CompletableFuture<String> sayHelloStr(String name);
}
