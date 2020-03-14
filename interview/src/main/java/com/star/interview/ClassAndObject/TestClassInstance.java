package com.star.interview.ClassAndObject;

/**
 * @ClassName TestClassInstance
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/19 23:37
 * @ModifyDate 2020/2/19 23:37
 * @Version 1.0
 */
public class TestClassInstance {

    public static final String NAME = "star";

    private String nick_name = NAME;

    private String id;
    private int salary;

    public TestClassInstance(String id,int salary){
        this.id = id;
        this.salary = salary;
    }

    private String getName(){
        return NAME;
    }

      //this can not be referenced from a static context
//    public static String getNickName(){
//        return this.nick_name;
//    }


}
