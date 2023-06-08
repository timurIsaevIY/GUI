package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] graph = {{0,2,7,0,0}, {2,0,5,4,0}, {7,5,0,0,3}, {0,4,0,0,9}, {0,0,3,9,0}};
        System.out.println(Arrays.toString(new Calculate(graph).out(2, 3)));
    }
}
