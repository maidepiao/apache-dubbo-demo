package com.star.demo.service.impl;

import com.star.demo.service.HelloServiceAsync;
import org.apache.dubbo.common.utils.NamedThreadFactory;
import org.apache.dubbo.rpc.RpcContext;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName HelloServiceAsyncImpl
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 19:59
 * @ModifyDate 2020/2/19 19:59
 * @Version 1.0
 */
public class HelloServiceAsyncImpl implements HelloServiceAsync {

    private final ThreadPoolExecutor busiThreadPool = new ThreadPoolExecutor(8,15,1,TimeUnit.MINUTES,
            new SynchronousQueue<>(),new NamedThreadFactory("busi-thread-pool"),new ThreadPoolExecutor.CallerRunsPolicy());

    @Override
    public CompletableFuture<String> sayHelloStr(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return CompletableFuture.supplyAsync(()->{
            System.out.println("async...");
            return "Hello " + name + rpcContext.getAttachment("tester");
        },busiThreadPool);
    }
}
