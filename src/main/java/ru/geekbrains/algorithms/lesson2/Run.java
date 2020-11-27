package ru.geekbrains.algorithms.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Run {

    public static void main(String[] args) {
        Random rnd = new Random();
        long time;
        SortClass sortClass = new SortClass();

        int [] arr = new int [200_000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1_000);
        }
        int [] arr2 = Arrays.copyOf(arr,arr.length);
        int [] arr3 = Arrays.copyOf(arr,arr.length);


        time = System.currentTimeMillis();
        sortClass.selectionSort(arr);
        System.out.println("Время работы сортировки выбором: " + (System.currentTimeMillis() - time) / 1000
                + " Секунд");

        time = System.currentTimeMillis();
        sortClass.insertSort(arr2);
        System.out.println("Время работы сортировки вставки: " + (System.currentTimeMillis() - time)/ 1000
                + " Секунд");


        time = System.currentTimeMillis();
        sortClass.bubbleSort(arr3);
        System.out.println("Время работы сортировки пузырьком: " + (System.currentTimeMillis() - time)/ 1000
                + " Секунд");


    }
}
