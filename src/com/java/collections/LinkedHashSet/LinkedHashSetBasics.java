package com.java.collections.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetBasics {

    public static void main(String[] args) {

//  it is similar to the HashSet and TreeSet except the below mentioned differences:
//
//    1. HashSet doesn’t maintain any kind of order of its elements.
//    2. TreeSet sorts the elements in ascending order.
//    3. LinkedHashSet maintains the insertion order.
//       Elements gets sorted in the same sequence in which they have been added to the Set.

        LinkedHashSet <Integer> lhs = new LinkedHashSet<>() ;
        lhs.add(211);
        lhs.add(123);
        lhs.add(122);
        lhs.add(43);
        lhs.add(541);

        System.out.println("linkedHashSet " + lhs + " maintains insertion order");

//        adding duplicate elements
        lhs.add(122);
        System.out.println("lhs after adding 122 again " + lhs);
        System.out.println("lhs doesn't allow duplicate elements");


//        List vs Set
//  1) List is an ordered collection it maintains the insertion order, which means upon displaying the list content it will display the elements in the same order in which they got inserted into the list.
//     Set is an unordered collection, it doesn’t maintain any order. There are few implementations of Set which maintains the order such as LinkedHashSet (It maintains the elements in insertion order).
//
//  2) List allows duplicates while Set doesn’t allow duplicate elements. All the elements of a Set should be unique if you try to insert the duplicate element in Set it would replace the existing value.
//
//  3) List implementations: ArrayList, LinkedList etc.
//     Set implementations: HashSet, LinkedHashSet, TreeSet etc.
//
//  4) List allows any number of null values. Set can have only a single null value at most.
//
//  5) ListIterator can be used to traverse a List in both the directions(forward and backward) However it can not be used to traverse a Set. We can use Iterator (It works with List too) to traverse a Set.
//
//  6) List interface has one legacy class called Vector whereas Set interface does not have any legacy class.
//        legacy class = Legacy classes and interfaces are the classes and interfaces that formed the collections framework in the earlier versions of Java and how now been restructured or re-engineered.


    }
}
