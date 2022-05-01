package com.java.collections;

import java.util.ArrayList;

public class CloneArrayList {

    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        System.out.println(al);

        ArrayList <Integer> al2 = (ArrayList<Integer>) al.clone(); //why didn't use new keyword here ?
        System.out.println(al2);

        al.add(5);
        al.add(6);

        System.out.println("al= "+ al);
        System.out.println("al2= "+ al2);

    }
}
