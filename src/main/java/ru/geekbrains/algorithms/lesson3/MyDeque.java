package ru.geekbrains.algorithms.lesson3;

import java.util.Arrays;

public class MyDeque <T>{
    private int size;
    private T[] list;
    private final int DEFAULT_CAPACITY = 10;
    private int leftElement;
    private int rightElement;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

        list = (T[]) new Object[capacity];
    }

    public MyDeque() {

        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        leftElement = decreaseIndex(leftElement);
        list[leftElement] = item;
        size++;

    }
    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        list[rightElement] = item;
        size++;
        rightElement = increaseIndex(rightElement);
    }




    public T peekFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        return list[leftElement];

    }

    public T removeLeft() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        T temp = list[leftElement ];
        list[leftElement] = null;
        size--;
        leftElement = increaseIndex(leftElement);
        return temp;

    }

    public T removeRight() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        T temp = list[rightElement - 1];
        list[rightElement - 1] = null;
        size--;
        rightElement = decreaseIndex(rightElement);
        return temp;

    }

    private int increaseIndex(int index){
        int nextIndex = (index + 1 == list.length) ? 0 : index + 1;

        return nextIndex;
    }
    private int decreaseIndex(int index){
        int nextIndex = (index - 1 <= 0) ? list.length - 1 : index - 1;

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
