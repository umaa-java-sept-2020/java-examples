package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList<>() ;
        al.add(1);
        al.add(9);
        al.add(9);
        al.add(8);

        System.out.println("arraylist1 = " + al);

        //approach i. get()

         int arr [] = new int [al.size()] ;
        for (int i=0; i<al.size(); i++){
            arr[i] = al.get(i) ;
        }

        System.out.print("array1 = " );
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();

        //approach ii. toArray()

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("abc") ;
        al2.add("vfg") ;
        al2.add("dec") ;
        System.out.println("al2 = " + al2);

        String arr1 [] = al2.toArray(new String [al2.size()]);

        System.out.print("array2 = " );
        for(String i : arr1)
            System.out.print(i + " ");
        System.out.println();

        ArrayList <Integer> al3 = new ArrayList<>() ;
        al3.add(1);
        al3.add(9);
        al3.add(9);
        al3.add(8);

        System.out.println("arraylist3 = " + al3);

        Integer arr2 [] = al3.toArray(new Integer [al3.size()]); //we have to use Integer as data type (wrapper) int not supported, ERROR
//        Integer arr2 [] = al3.toArray(new Integer [0]);
//        up there passing 0 as size means, passing an empty array. this makes arraylist to create a new array
//        new array is a SHALLOW COPY of the elements of ArrayList
//        when we pass non-empty array then ArrayList uses the same array

        System.out.print("array3 = " );
        for(int i : arr2)
            System.out.print(i + " ");

    }
}
