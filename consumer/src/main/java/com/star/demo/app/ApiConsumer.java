package com.star.demo.app;

import com.star.demo.service.HelloService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.rpc.RpcContext;

import javax.sound.midi.SysexMessage;


/**
 * @ClassName APIConsumer
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 18:32
 * @ModifyDate 2020/2/19 18:32
 * @Version 1.0
 */
public class ApiConsumer {

    public static void main(String[] args) {
        ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig("dubbo-demo-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.244.100:2181"));
        referenceConfig.setInterface(HelloService.class);
        referenceConfig.setTimeout(5000);
        referenceConfig.setVersion("1.0.0");
        referenceConfig.setGroup("dubbo");
        HelloService helloService = referenceConfig.get();
        RpcContext.getContext().setAttachment("tester","star.hu");
        System.out.println(helloService.sayHelloStr("python3"));
    }
}
