package com.star.interview.proxy;

import com.star.interview.Collect.Node;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyFactory
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/23 23:34
 * @ModifyDate 2020/2/23 23:34
 * @Version 1.0
 */
public class ProxyFactory implements InvocationHandler {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        System.out.println(proxy.getClass().getName());
        after();
        return result;
    }

    private void before(){
        System.out.println("before......");
    }
    private void after(){
        System.out.println("after......");
    }

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new HelloImpl());
        Hello hello = factory.getProxy();
        hello.hello("star");
        hello.toString();
    }
}
