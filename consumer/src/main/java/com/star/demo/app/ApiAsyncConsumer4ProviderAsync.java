package com.star.demo.app;

import com.star.demo.service.HelloService;
import com.star.demo.service.HelloServiceAsync;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.rpc.RpcContext;

import java.util.concurrent.CompletableFuture;

/**
 * @ClassName ApiAsyncConsumer4ProviderAsync
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 20:08
 * @ModifyDate 2020/2/19 20:08
 * @Version 1.0
 */
public class ApiAsyncConsumer4ProviderAsync {

    public static void main(String[] args) {
        ReferenceConfig<HelloServiceAsync> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig("dubbo-demo-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.244.100:2181"));
        referenceConfig.setInterface(HelloServiceAsync.class);
        referenceConfig.setTimeout(5000);
        referenceConfig.setVersion("1.0.0");
        referenceConfig.setGroup("dubbo");

        HelloServiceAsync helloService = referenceConfig.get();
        RpcContext.getContext().setAttachment("tester","star.hu");
        CompletableFuture<String> future = helloService.sayHelloStr("python3");
        future.whenComplete((s,t)->{
            if(t!=null){
                t.printStackTrace();
            }else{
                System.out.println(s);
            }
        });
        System.out.println("完成");
    }
}
