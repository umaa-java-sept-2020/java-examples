package com.java.collections;

import java.util.ArrayList;

public class TrimSize {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(50);  //not working
        ArrayList <Integer> al2 = new ArrayList<>();
        System.out.println("before inserting elements = "+ al.size());

        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println("before trimToSize = "+ al.size());

        al.trimToSize();
        System.out.println("after trimToSize = "+ al.size());

        al.ensureCapacity(20);
        System.out.println("after ensure capacity = " + al.size() );  //how ensure capacity works then ?
    }
}
