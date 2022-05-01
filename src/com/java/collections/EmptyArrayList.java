package com.java.collections;

//make ArrayList empty

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmptyArrayList {

    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList<>() ;
        al.add(1) ;
        al.add(2) ;
        al.add(3) ;

        System.out.println(al);
        al.clear() ; //approach i. clear()
        System.out.println(al);

        al.add(1) ;
        al.add(2) ;
        al.add(3) ;
        System.out.println(al);
        al.removeAll(al); //approach ii. removeAll()
                         //check the internal code of removeAll() ??
        System.out.println(al);

        al.add(9);
        System.out.println(al);

    }
}
