package com.star.interview.dataStructs;

/**
 * @ClassName MyArrayQueue
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/26 15:34
 * @ModifyDate 2020/2/26 15:34
 * @Version 1.0
 */
public class MyArrayQueue<E> implements IQueue<E> {

    private MyArray<E> myArray;

    public MyArrayQueue(int capacity){
        myArray = new MyArray<>(capacity);
    }

    public MyArrayQueue(){
        myArray = new MyArray<>();
    }

    @Override
    public int getSize() {
        return myArray.getSize();
    }

    @Override
    public boolean isEmpty() {
        return myArray.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        myArray.addLast(e);
    }

    @Override
    public E dequeue() {
        return myArray.remove(0);
    }

    @Override
    public E getFront() {
        return myArray.get(0);
    }

    public int getCapacity(){
        return myArray.getCapacity();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("MyArray: size=%d, capacity=%d\n",this.getSize(),this.getCapacity()));
        res.append("Head [");
        for (int i = 0; i < this.getSize(); i++) {
            res.append(myArray.get(i));
            if(i != this.getSize()-1){
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
