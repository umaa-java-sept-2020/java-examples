package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {

    private static void display(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }

    }


    public static void main(String[] args) {

      //  m1();
        m2();
    }

    /**
     *  adding 1d int[] into the arraylist
     */
    public static void m2()
    {
        int[] arr= {1,2,3,4};
        List<Integer> list =  new ArrayList(Arrays.asList(arr));
        Object obj = list.get(0);
        int[] result = (int[]) obj;
        System.out.println(Arrays.toString(result));
    }

    public static void m1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(45);
        list.add(32);

        display(list);

    }
}
