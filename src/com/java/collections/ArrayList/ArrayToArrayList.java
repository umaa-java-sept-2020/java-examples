package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

    public static void main(String[] args) {

        Integer arr[] = new Integer[] {2,4,5,1} ;

        for(int i : arr)
            System.out.println(i);

        //approach i. Arrays.asList()
        ArrayList <Integer> al = new ArrayList <Integer> (Arrays.asList(arr)) ;
//        above code, only works when array is declared as Integer instead of int
        System.out.println(al);

//        approach ii. Collections.addAll()
        String array[]={"hi", "hello", "hola"};
        ArrayList<String> arraylist = new ArrayList<>();
        Collections.addAll(arraylist, array);
        System.out.println(arraylist);

        Integer array1 [] = {1,2,3,4} ; //int not allowing but Integer do
        ArrayList <Integer> al2 = new ArrayList<>();
        Collections.addAll(al2, array1);
        System.out.println(al2);

//        approach iii. by using loop

        ArrayList <Integer> al4 = new ArrayList<>() ;
        int arr3 [] = new int [] {22,10,1998};

        for(int i=0; i< arr3.length; i++)
            al4.add(arr3[i]) ;

//        al4.addAll(arr3); //why addAll() can't be used

        System.out.println(al4);
//        how come by using loop, int allows ?

    }
}
