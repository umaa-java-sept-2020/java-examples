package com.java.collections.ArrayList;

//make ArrayList empty

import java.util.ArrayList;

public class EmptyArrayList {

    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList<>() ;
        al.add(1) ;
        al.add(2) ;
        al.add(3) ;

        System.out.println("al = "+ al);

        //approach i. clear()
        al.clear() ;
        System.out.println("after clear()" + al);

        al.add(1) ;
        al.add(2) ;
        al.add(3) ;
        System.out.println("al = " + al);

        //approach ii. removeAll()
        al.removeAll(al);
        System.out.println("after removeAll() = " + al);

        al.add(9);
        al.add(5);
        al.add(3);
        al.add(6);
        System.out.println("al = " + al);

        ArrayList <Integer> al2 = new ArrayList<>() ;
        al2.add(9) ;
        al2.add(3) ;
        al2.add(1) ;
        System.out.println("al2 = " + al2);

        al.removeAll(al2) ; //removeAll() delete elements specified in other arraylist too
        System.out.println("After removing elements of al2 from al : " + al);

        //to check if ArrayList is empty or not
        System.out.println("al2 before emptying = " + al2.isEmpty() ) ;
        al2.clear() ;
        System.out.println("al2 after emptying = " + al2.isEmpty() ) ;


    }
}
