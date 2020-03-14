package com.star.interview.Collect;

import java.util.Iterator;

/**
 * @ClassName TestLinkedList
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/20 1:23
 * @ModifyDate 2020/2/20 1:23
 * @Version 1.0
 */
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = LinkedList.newEmptyList();
        Node<Integer> node = new Node<>(100);
        linkedList.add(node);
        Node<Integer> node2 = new Node<>(200);
        linkedList.add(node2);
        Iterator iter = linkedList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
