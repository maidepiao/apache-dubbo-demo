package com.star.interview.dataStructs;

/**
 * @ClassName MyArrayTest
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/24 22:19
 * @ModifyDate 2020/2/24 22:19
 * @Version 1.0
 */
public class MyArrayTest {

    public static void main(String[] args) {
        MyArray<Integer> array = new MyArray<>(10);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(2,100);
        System.out.println(array);

        array.remove(1);
        System.out.println(array);

        array.remove(1);
        System.out.println(array);

        array.removeElement(100);
        System.out.println(array);

        array.removeLast();
        System.out.println(array);
    }
}
