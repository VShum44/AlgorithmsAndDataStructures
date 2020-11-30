package ru.geekbrains.algorithms.lesson3;

import java.util.Arrays;

public class MyQueue<T> {
    private int size;
    private T[] list;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

        list = (T[]) new Object[capacity];
    }

    public MyQueue() {

        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        list[end] = item;
        size++;
        end = nextIndex(end);
    }


    public T peekFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        return list[begin];

    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        T temp = list[begin];
        list[begin] = null;
        size--;
        begin = nextIndex(begin);
        return temp;

    }

    private int nextIndex(int index){
        int nextIndex = (index + 1 == list.length) ? 0 : index + 1;

        return nextIndex;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    public int size() {        return size;    }

    public boolean isEmpty() { return size == 0;   }

    private boolean isFull() {  return size == list.length;  }
}

