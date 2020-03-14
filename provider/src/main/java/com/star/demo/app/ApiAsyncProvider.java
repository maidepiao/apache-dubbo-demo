package com.star.demo.app;

import com.star.demo.service.HelloServiceAsync;
import com.star.demo.service.impl.HelloServiceAsyncImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @ClassName ApiAsyncProvider
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 20:06
 * @ModifyDate 2020/2/19 20:06
 * @Version 1.0
 */
public class ApiAsyncProvider {

    public static void main(String[] args) {
        ServiceConfig serviceConfig = new ServiceConfig<HelloServiceAsync>();
        serviceConfig.setApplication(new ApplicationConfig("dubbo-demo-provider"));
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://192.168.244.100:2181");
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setInterface(HelloServiceAsync.class);
        serviceConfig.setRef(new HelloServiceAsyncImpl());
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
