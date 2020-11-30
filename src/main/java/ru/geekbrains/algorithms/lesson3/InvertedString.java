package ru.geekbrains.algorithms.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertedString {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private MyStack<Character> myStack;
    private String line;

    public void reverse(){

        try {
             line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        myStack = new MyStack<>(line.length());

        for (int i = 0; i < line.length(); i++) {
            myStack.push(line.charAt(i));

        }
        while (!myStack.isEmpty()){
            System.out.print( myStack.pop());
        }
    }

}
