package com.star.demo.app;

import com.star.demo.service.HelloService;
import com.star.demo.service.impl.HelloServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @ClassName ApiProvider
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 18:24
 * @ModifyDate 2020/2/19 18:24
 * @Version 1.0
 */
public class ApiProvider {

    public static void main(String[] args) {
        ServiceConfig serviceConfig = new ServiceConfig<HelloService>();
        serviceConfig.setApplication(new ApplicationConfig("dubbo-demo-provider"));
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://192.168.244.100:2181");
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(new HelloServiceImpl());
        serviceConfig.setVersion("1.0.0");
        serviceConfig.setGroup("dubbo");
        serviceConfig.export();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}