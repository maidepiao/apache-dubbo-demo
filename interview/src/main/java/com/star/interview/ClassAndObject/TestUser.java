package com.star.interview.ClassAndObject;

/**
 * @ClassName TestUser
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/20 2:20
 * @ModifyDate 2020/2/20 2:20
 * @Version 1.0
 */
public class TestUser {

    public static void main(String[] args) {
        User user = new User();
        user.setId("1000");
        System.out.println(user.getId());
        user.setId("2000");
        System.out.println(user.getId());

    }
}
