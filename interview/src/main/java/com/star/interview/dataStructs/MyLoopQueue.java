package com.star.interview.dataStructs;

/**
 * @ClassName MyLoopQueue
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/26 17:28
 * @ModifyDate 2020/2/26 17:28
 * @Version 1.0
 */
public class MyLoopQueue<E> implements IQueue<E> {

    private E[] data;
    private int front,tail;
    private int size = 0;

    public MyLoopQueue(int capacity){
        data = (E[]) new Object[capacity+1];
        front = tail = 0;
        size = 0;
    }

    public MyLoopQueue(){
        this(11);
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public boolean isEmpty(){
        return front == tail;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
