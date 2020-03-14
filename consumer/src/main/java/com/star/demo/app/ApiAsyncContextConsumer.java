package com.star.demo.app;

import com.star.demo.service.HelloService;
import com.star.demo.service.HelloServiceRpcContext;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @ClassName ApiAsyncContextConsumer
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 20:38
 * @ModifyDate 2020/2/19 20:38
 * @Version 1.0
 */
public class ApiAsyncContextConsumer {

    public static void main(String[] args) {
        ReferenceConfig<HelloServiceRpcContext> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig("dubbo-demo-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.244.100:2181"));
        referenceConfig.setInterface(HelloServiceRpcContext.class);
        referenceConfig.setTimeout(5000);
        referenceConfig.setVersion("1.0.0");
        referenceConfig.setGroup("dubbo");
        HelloServiceRpcContext helloService = referenceConfig.get();
        RpcContext.getContext().setAttachment("tester","star.hu");
        System.out.println(helloService.sayHelloStr("python3"));
    }
}
