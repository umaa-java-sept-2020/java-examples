package com.java.collections.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LlBasics {

    public static void main(String[] args) {

        LinkedList <Integer> ll = new LinkedList<>() ;

//        adding elements
        ll.add(12) ;
        ll.add(8) ;
        ll.add(05) ; //adding 05 but 5 coming, how to bring 05 ?
        ll.add(1243) ;

//        adding elements at first position
        ll.addFirst(34);

//        adding elements at last position
        ll.addLast(1); //same as add()

//        adding elements at specific position
        ll.add(3, 33);
        System.out.println(ll);

//        addAll()
        ArrayList <Integer> alint = new ArrayList<>() ;
        alint.add(322) ;
        alint.add(211);
        ll.addAll(alint) ;
        System.out.println("after adding elements of arraylist = " + ll);

        ll.addAll(3, alint);
        System.out.println("adding elements after specific position = " + ll);

//        push() -> add elements at first
        ll.push(444) ;
        System.out.println("after push " + ll);

//        pop() -> remove first element and return it
        System.out.println(ll.pop());
        System.out.println("after pop = " + ll);

//        peek() -> retrives only, don't delete the first element
        System.out.println("peek = " + ll.peek() );

//        peekFirst() -> retrives the first element
        System.out.println("peekFirst = " + ll.peekFirst());

//        peekLast() -> retrives the last element
        System.out.println("peekLast = " + ll.peekLast());


//        deleting elements
//        ll.removeFirst() ;
//        System.out.println("remove first " + ll);
//
//        ll.removeLast();
//        System.out.println("remove last " +ll);
//
//        ll.remove(3);
//        System.out.println("remove at index 3 = " + ll);
//
////        remove() -> delete first element
//        ll.remove();
//        System.out.println("remove() = " + ll);

//        removeFirstOccurrence()
//        ll.removeFirstOccurrence((Integer)322) ;
//        System.out.println("remove first occurrence = " + ll);

//        removeLastOccurrence()
//        ll.removeLastOccurrence((Integer)322) ;
//        System.out.println("remove last occurrence = " + ll);

//        remove(Object) -> passing element
//        ll.remove((Integer)33); //typecasting into Integer
//        System.out.println("remove 33 = " + ll);

//        remove all elements
//        ll.clear();
//        System.out.println("after clear = " + ll);

//        get or set elements
        Object firstvar = ll.get(0);
        System.out.println("element at 2nd index = "+ ll.get(1));
        System.out.println("First element: " +firstvar);
        ll.set(0, 555);
        Object firstvar2 = ll.get(0);
        System.out.println("First element after update by set method: " +firstvar2);

//        get first element
        System.out.println("first element = " + ll.getFirst());

//        get last element
        System.out.println("last element = " + ll.getLast());

//        copy of the list -> SHALLOW COPY ?
        LinkedList <Integer> ll2 = new LinkedList <>() ;
        ll2 = (LinkedList<Integer>) ll.clone();
        System.out.println("clone = " + ll2);
        System.out.println("clone = " + ll.clone());

//        check contains
        System.out.println("contains 322 = " + ll.contains(322)) ;
        System.out.println("contains 333 = " + ll.contains(333)) ;

//        indexOf() -> returns first occurrence of element
        System.out.println("index of 322 = " + ll.indexOf(322));

//        lasIndexOf() -> returns last occurrence of elements
        System.out.println("lastIndexOf 322 = " + ll.lastIndexOf(322));
        System.out.println("lastIndexOF 555 = " + ll.lastIndexOf(555) + " coz 555 doesn't exist");
//        returns 0 for Integer and -1 for String (if element doesn't exist)

//        poll() -> returns and remove the first element of the list
        System.out.println("poll() = " + ll.poll());
        System.out.println("after poll = " + ll);

//       pollFirst() -> same as poll()
        System.out.println("pollFirst() = " + ll.pollFirst());
        System.out.println("after pollFirst() = " + ll);

//        pollLast() -> returns and remove the last element of the List
        System.out.println("pollLast() = " + ll.pollLast());
        System.out.println("after pollLast() = " + ll);

//        size()
        System.out.println("size of ll = " + ll.size());

//        iterating linked list
//        i. for loop

        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }

//        ii. for-each loop
        for(int i : ll)
            System.out.println(i);

//        iii. while-loop
        int n = 0 ;
        while(ll.size() > n) {
            System.out.println(ll.get(n));
            n++;
        }

//        iv. iterator
        Iterator <Integer> itr = ll.iterator() ;
        while(itr.hasNext())
            System.out.println(itr.next());

//        ListIterator
        System.out.println("ListIterator");
        ListIterator litr = ll.listIterator();
//        using ListIterator we can traverse the linked list in both directions
//        forward and backward
//
//        i.forward
        System.out.println("forward");
        while(litr.hasNext())
            System.out.println(litr.next());

//        ii. backward -> doesn't work if written before forward. It iterate when already once iteration is done
        System.out.println("backward");
        while(litr.hasPrevious())
            System.out.println(litr.previous());

//        descendingIterator() -> Iterating in reverse order
        System.out.println("descending iterator");
        Iterator litr1 = ll.descendingIterator();

        while(litr1.hasNext())
            System.out.println(litr1.next());


//        subList(startingIndex, endIndex)
        System.out.println("sub-list = " + ll.subList(2,6));


//      Conversion LinkedList -> ArrayList
        ArrayList <Integer> al = new ArrayList<>(ll) ;
        System.out.println("ArrayList = " + al);

//        LinkedList -> Array
        Integer ar [] = ll.toArray(new Integer[ll.size()]) ; // int not working here, therefore used Integer
        for(int i : ar)
            System.out.println(i);

//        synchronized ?

    }
}
