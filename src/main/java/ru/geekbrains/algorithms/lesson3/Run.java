package ru.geekbrains.algorithms.lesson3;

public class Run {

    public static void main(String[] args) {
//        InvertedString invertedString = new InvertedString();
//        invertedString.reverse();
        MyDeque<Integer> myDeque = new MyDeque<>(5);
            myDeque.insertLeft(1);
            myDeque.insertLeft(2);
            myDeque.insertRight(3);
            myDeque.insertRight(4);
            myDeque.insertRight(5);
        System.out.println(myDeque);
        System.out.println(myDeque.removeRight());
            myDeque.insertRight(6);
        System.out.println(myDeque);
        System.out.println(myDeque.removeLeft());
        System.out.println(myDeque);
        myDeque.insertLeft(7);
        System.out.println(myDeque);
        System.out.println(myDeque.removeRight());
        System.out.println(myDeque);
    }
}
