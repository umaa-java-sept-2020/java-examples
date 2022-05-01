package com.java.collections;

import java.util.ArrayList;

public class CheckEmpty {

    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList<>();
        ArrayList <Integer> al2 = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println(al.isEmpty()); //false if no
        System.out.println(al2.isEmpty()); //true if yes
    }
}
