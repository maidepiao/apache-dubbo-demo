package com.star.interview.ClassAndObject;

/**
 * @ClassName TestObjectMethod
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 23:48
 * @ModifyDate 2020/2/19 23:48
 * @Version 1.0
 */
public class TestObjectMethod {

    public static void main(String[] args) {
        TestClassInstance t1 = new TestClassInstance("1",2000);
        TestClassInstance t2 = new TestClassInstance("1",2000);
        System.out.println(t1==t2);
    }
}
