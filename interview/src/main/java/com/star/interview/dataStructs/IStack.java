package com.star.interview.dataStructs;

/**
 * @ClassName IStack
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/25 9:04
 * @ModifyDate 2020/2/25 9:04
 * @Version 1.0
 */
public interface IStack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
