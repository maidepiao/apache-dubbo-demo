package com.star.interview.dataStructs;

/**
 * @ClassName MyArrayQueueTest
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/26 15:44
 * @ModifyDate 2020/2/26 15:44
 * @Version 1.0
 */
public class MyArrayQueueTest {

    public static void main(String[] args) {

        MyArrayQueue<Integer> queue = new MyArrayQueue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);

        queue.enqueue(200);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);

        System.out.println(queue.getFront());
        System.out.println(queue);


    }
}
