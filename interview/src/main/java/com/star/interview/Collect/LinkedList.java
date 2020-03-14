package com.star.interview.Collect;

import lombok.Data;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @ClassName LinkedList
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/20 0:39
 * @ModifyDate 2020/2/20 0:39
 * @Version 1.0
 */
public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(Node<T> node) {
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

    private LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static <T> LinkedList<T> newEmptyList() {
        return new LinkedList<T>();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> currentNode;

        public LinkedListIterator(Node head) {
            currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (currentNode == null) {
                throw new NoSuchElementException();
            }
            T value = currentNode.getValue();
            currentNode = currentNode.getNext();
            return value;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator(head);
    }
}
