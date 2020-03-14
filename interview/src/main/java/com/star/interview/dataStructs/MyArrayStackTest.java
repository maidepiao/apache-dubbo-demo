package com.star.interview.dataStructs;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @ClassName MyArrayStackTest
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/25 9:25
 * @ModifyDate 2020/2/25 9:25
 * @Version 1.0
 */
public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack<Integer> stack = new MyArrayStack<>(10);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack);

        stack.push(100);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
