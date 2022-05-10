package com.java.collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LlBasics {

    public static void main(String[] args) {

        LinkedList <Integer> ll = new LinkedList<>() ;

//        adding elements
        ll.add(12) ;
        ll.add(8) ;
        ll.add(05) ; //adding 05 but 5 coming, how to bring 05 ?
        ll.add(1243) ;

        ll.addFirst(34);
        ll.addLast(1); //same as add()

        ll.add(3, 33);
        System.out.println(ll);

//        accessing elements / traversing elements
        Iterator <Integer> itr = ll.iterator() ;
        while(itr.hasNext())
            System.out.println(itr.next());


//        deleting elements
        ll.removeFirst() ;
        System.out.println("rf " + ll);

        ll.removeLast();
        System.out.println("rl " +ll);

        ll.remove(3);
        System.out.println(ll);

//        get or set elements
        Object firstvar = ll.get(0);
        System.out.println("element at 2nd index = "+ ll.get(1));
        System.out.println("First element: " +firstvar);
        ll.set(0, 555);
        Object firstvar2 = ll.get(0);
        System.out.println("First element after update by set method: " +firstvar2);


    }
}
