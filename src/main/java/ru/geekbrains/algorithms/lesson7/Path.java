package ru.geekbrains.algorithms.lesson7;

import java.util.LinkedList;

public class Path {
      boolean[] marked;
     int[] edgeTo;
     int source;

    public boolean hasPathTo(int dist){
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist){
        if(!hasPathTo(dist)){
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
