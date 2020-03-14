package com.star.interview.Collect;

import lombok.Data;

/**
 * @ClassName Node
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/20 0:38
 * @ModifyDate 2020/2/20 0:38
 * @Version 1.0
 */
@Data
public class Node<T> {

    private Node<T> next;
    private T value;

    public Node(T value){
        this.value = value;
    }
}
