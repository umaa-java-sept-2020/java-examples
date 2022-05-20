//A Set is a Collection that cannot contain duplicate elements.
// There are three main implementations of Set interface: HashSet, TreeSet, and LinkedHashSet.

// HashSet, which stores its elements in a hash table, is the best-performing implementation;
// however it makes no guarantees concerning the order of iteration.

// TreeSet, which stores its elements in a red-black tree, orders its elements based on their values;
// it is substantially slower than HashSet.

// LinkedHashSet, which is implemented as a hash table with a linked list running through it,
// orders its elements based on the order in which they were inserted into the set (insertion-order).

//This class implements the Set interface, backed by a hash table (actually a HashMap instance).
// It makes no guarantees as to the iteration order of the set;
// in particular, it does not guarantee that the order will remain constant over time.


//HashSet doesn’t maintain any order, the elements would be returned in any random order.
//HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
//HashSet allows null values however if you insert more than one nulls it would still return only one null value.
//HashSet is non-synchronized.
//The iterator returned by this class is fail-fast
// which means iterator would throw ConcurrentModificationException if HashSet has been modified
// after creation of iterator, by any means except iterator’s own remove method.

package com.java.collections.HashSet;

import java.util.*;

public class HashSetBasics {

    public static void main(String[] args) {

    HashSet <Integer> hs = new HashSet<>();

//  adding elements
    hs.add(12);
    hs.add(21);
    hs.add(111);
    hs.add(323);
    hs.add(544);
    hs.add(455);

//    adding duplicate elements
//        old values get overwritten
        hs.add(544) ;
        hs.add(111);

//        adding null values
//        only one null is displayed in spite of multiple null values
        hs.add(null);
        hs.add(null);

//        display HashSet
        System.out.println("HashSet = " + hs);


//        clone
        HashSet <Integer> hs1 = (HashSet<Integer>) hs.clone() ;
        System.out.println("clone hs1 = " + hs1);

//      remove all elements
//        hs.clear();
//        System.out.println("clear() =" + hs);

//        remove specific element
//        System.out.println("hs.remove(544) = " + hs.remove(544));

//        removeAll() specified in another Collection
//        System.out.println("hs.removeAll(Collections) = " + hs.removeAll(hs1));


//        contains()
        System.out.println("contains 111 = " + hs.contains(111));
        System.out.println("contains 555 = " + hs.contains(555));

//        containsAll()
        System.out.println("containsAll(hs1) = " + hs.containsAll(hs1));

//        isEmpty()
        System.out.println("hs isEmpty() = " + hs.isEmpty());

//        size()
        System.out.println("hs.size() = " + hs.size());

//       Iteration through -> i. itertator
//        Iterator <Integer> itr = hs.iterator() ;
//                while(itr.hasNext())
//                System.out.println(itr.next());


//                ii. iteration without iterator
//      for(int i : hs)
//          System.out.println(i);


//      HashSet -> Array (string is not working, CHECK BELOW, integer too)
//        System.out.println("HashSet to Array ");
//        Integer arr[] = new Integer [hs.size()] ;

//        hs.toArray(arr);
//        System.out.println(Arrays.toString(arr));

//        for(int i : arr)
//            System.out.println(i);

        //Creating an empty integer array
//        Integer[] array = new Integer[hashSet.size()];
        //Converting Set object to integer array
//        int j = 0;
//        for (Integer i: hs) {
//            arr[j++] = i;
//        }
//
//        System.out.println("array iteration");
//        for(int i : arr)
//            System.out.println(i);

        System.out.println("String HashSet to Array ");
        HashSet <String> hs2 = new HashSet<>();
        hs2.add("ramesh");
        hs2.add("suresh");

        System.out.println(hs2);

        String arr[] = new String[hs2.size()];
        for(String s : arr)
            System.out.println(s); // why NULL in output ??


//        HashSet -> TreeSet
//        String working but not Integer
        System.out.println("HashSet -> TreeSet");
        TreeSet<String> ts = new TreeSet<String>(hs2);

        for(String i : ts)
            System.out.println(i);

//        HashSet -> ArrayList
//        not working only one first index element
        System.out.println("HashSet -> ArrayList");
        List<Integer> al = new ArrayList<>(hs);
        for(int i : al)
            System.out.println(i);

//        HashMap vs HashSet
//        similarities in Hashset and HashMap
//        Both HashMap and HashSet are not synchronized which means they are not suitable for thread-safe operations until unless synchronized explicitly.

//If you look at the source code of HashSet then you may find that it is backed up by a HashMap.
// So basically it internally uses a HashMap for all of its operations. -> HOW?

//        They both provide constant time performance for basic operations such as adding, removing element etc.


//        HashSet vs TreeSet
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
