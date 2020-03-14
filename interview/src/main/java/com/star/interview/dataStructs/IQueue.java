package com.star.interview.dataStructs;

/**
 * @ClassName IQueue
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/26 15:32
 * @ModifyDate 2020/2/26 15:32
 * @Version 1.0
 */
public interface IQueue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
