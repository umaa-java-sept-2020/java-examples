package com.java.collections.TreeSet;

import java.util.TreeSet;

public class TreeSetBasics {

    public static void main(String[] args) {

        TreeSet <Integer> ts = new TreeSet<>() ;
        ts.add(11);
        ts.add(21);
        ts.add(1);
        ts.add(15);
        System.out.println("TreeSet = " + ts);
        System.out.println("by default sort in asc order");

        ts.add(1);
        System.out.println("adding 1 again " + ts);
        System.out.println("allow no duplicate values");

//        ts.add(null);
//        throws NullPointerException
//        can't add null values


//                HashSet vs TreeSet
//        1) HashSet gives better performance (faster) than TreeSet for
//        the operations like add, remove, contains, size etc. HashSet offers constant time cost while TreeSet offers log(n) time cost for such operations.
//
//        2) HashSet does not maintain any order of elements while TreeSet elements are
//        sorted in ascending order by default.
//
//        Similarities:
//
//        1) Both HashSet and TreeSet does not hold duplicate elements,
//        which means both of these are duplicate free.
//
//        2) If you want a sorted Set then it is better to add elements to HashSet and
//        then convert it into TreeSet rather than creating a TreeSet and adding elements to it.
//
//        3) Both of these classes are non-synchronized that means they are not
//        thread-safe and should be synchronized explicitly when there is a need of thread-safe operations.


    }

}
