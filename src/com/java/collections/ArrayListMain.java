package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    private static void display(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }

    }


    public static void main(String[] args) {

        m1();
    }

    public static void m1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(45);
        list.add(32);

        display(list);

    }
}
