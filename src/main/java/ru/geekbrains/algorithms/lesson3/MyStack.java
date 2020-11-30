package ru.geekbrains.algorithms.lesson3;

public class MyStack<T> {
    private int size;
    private T [] list;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity){
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

        list = (T[]) new Object[capacity];
    }

    public MyStack(){

        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(T item){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        list[size] = item;
        size++;
    }


    public T peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }
        return list[size - 1];

    }

    public T pop(){
        if(isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }

        T temp = list[size - 1];
        list[size - 1] = null;
        size--;

        return temp;


    }



    public int size(){

        return size;

    }

    public boolean isEmpty(){
        return size == 0;
    }


    private boolean isFull(){
       return size == list.length;
    }



}
