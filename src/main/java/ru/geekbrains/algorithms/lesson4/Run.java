package ru.geekbrains.algorithms.lesson4;

import java.util.Iterator;
import java.util.ListIterator;

public class Run {

    public static void main(String[] args) {

      MyLinkedList<String> mll = new MyLinkedList<>();
      mll.insertFirst("Привет");
      mll.insertFirst("Как");
      mll.insertFirst("Дела");
      mll.insertFirst("?");


        Iterator mllIter = mll.iterator();
        for (String s : mll) {
            System.out.println(s);
        }

        while (mllIter.hasNext()){
            if(mllIter.next().equals("Дела")) {
                mllIter.remove();
            }
        }

        System.out.println("----------");

        System.out.println(mll.isEmpty());

        System.out.println("----------");

        for (String s : mll) {
            System.out.println(s);
        }

    }
}
