package com.star.interview.dataStructs;

/**
 * @ClassName MyArray
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/24 8:51
 * @ModifyDate 2020/2/24 8:51
 * @Version 1.0
 */
public class MyArray<E> {

    private E[] data;
    private int size;

    public MyArray(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    public MyArray(){
        this(8);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(E e){
        this.add(size,e);
    }

    public void addFirst(E e){
        this.add(0,e);
    }

    public void add(int index,E e){
        if(index<0 || index>size){

        }
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public E get(int index){
        if(index<0 || index >=size){

        }
        return data[index];
    }

    public E getLast(){
        return this.get(size-1);
    }

    public void set(int index,E e){
        if(index<0 || index >=size){

        }
        data[index] = e;
    }

    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    public int find(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index){
        if (index < 0 || index >= size) {

        }
        E temp = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;

        if(size == data.length/4 && data.length/2 != 0){
            resize(data.length/2);
        }
        return temp;
    }

    public E removeLast(){
        return this.remove(size-1);
    }

    public void removeElement(E e){
        int index = this.find(e);
        if(index != -1){
            this.remove(index);
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("MyArray: size=%d, capacity=%d\n",size,data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size-1){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
