package com.star.interview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxy
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/23 21:54
 * @ModifyDate 2020/2/23 21:54
 * @Version 1.0
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
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
        Hello hello = new HelloImpl();
        DynamicProxy proxy = new DynamicProxy(hello);
        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),hello.getClass().getInterfaces(),proxy);
        helloProxy.hello("star");
    }
}
