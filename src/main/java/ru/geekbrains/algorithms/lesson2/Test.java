package ru.geekbrains.algorithms.lesson2;

import java.util.Arrays;

public class Test {

    public static int [] list = new int[10];

    public static void main(String[] args) {


        for (int i = 0; i < 20; i++) {
            if(i > 0 && list.length / i < 2){
                makeListLonger();
            }
            list [i] = i;
        }
        System.out.println(Arrays.toString(list));

    }

    private static void makeListLonger() {
        int [] tempList = Arrays.copyOf(list, list.length);
        System.out.println("tempList.length: " + tempList.length);

        list = Arrays.copyOf(tempList,tempList.length * 2);
        System.out.println("list.length: " + list.length);
    }
}
