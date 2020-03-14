package com.star.interview.proxy;

/**
 * @ClassName HelloImpl
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/23 21:56
 * @ModifyDate 2020/2/23 21:56
 * @Version 1.0
 */
public class HelloImpl implements Hello {
    @Override
    public String hello(String name) {
        System.out.println("Hello " + name);
        return "Hello " + name;
    }

    @Override
    public void byebye() {
        System.out.println("bye bye...");
    }
}
