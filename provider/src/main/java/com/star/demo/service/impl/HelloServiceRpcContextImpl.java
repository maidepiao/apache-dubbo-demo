package com.star.demo.service.impl;

import com.star.demo.service.HelloServiceRpcContext;
import org.apache.dubbo.common.utils.NamedThreadFactory;
import org.apache.dubbo.rpc.AsyncContext;
import org.apache.dubbo.rpc.RpcContext;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName HelloServiceRpcContextImpl
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 20:28
 * @ModifyDate 2020/2/19 20:28
 * @Version 1.0
 */
public class HelloServiceRpcContextImpl implements HelloServiceRpcContext {

    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8,16,
            1,TimeUnit.MINUTES,
            new SynchronousQueue<>(),
            new NamedThreadFactory("busi-thread-pool"),
            new ThreadPoolExecutor.CallerRunsPolicy());

    @Override
    public String sayHelloStr(String name) {
        final AsyncContext asyncContext = RpcContext.startAsync();
        threadPoolExecutor.execute(()->{
            asyncContext.signalContextSwitch();
            asyncContext.write("Hello " + name + " " + RpcContext.getContext().getAttachment("tester"));
        });
        return null;
    }
}
