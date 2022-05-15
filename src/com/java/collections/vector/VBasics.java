package com.java.collections.vector;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VBasics {

    public static void main(String[] args) {
//        Like ArrayList it also maintains insertion order but it is rarely used in non-thread environment
//        as it is synchronized and due to which it gives poor performance in searching, adding, delete and
//        update of its elements.

        Vector v = new Vector() ;
//        It creates an empty Vector with the default initial capacity of 10.
//        It means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector.
//        Note: By default vector doubles its size.
//        i.e. In this case the Vector size would remain 10 till 10 insertions and once we try to insert the 11th element
//        It would become 20 (double of default capacity 10).

        Vector v1 = new Vector(8) ;

        Vector v2 = new Vector(4,6) ;
//        Here we have provided two arguments. The initial capacity is 4 and capacityIncrement is 6.
//        It means upon insertion of 5th element the size would be 10 (4+6) and on
//        11th insertion it would be 16(10+6)

        v.add(123) ; //by default which type of vector is this ? (data type)
        v.add("abc") ;
        v.add(32.4);
        v.add("hi there");
        v.add(1223232);
        System.out.println(v);
        System.out.println("size after add = " + v.size());
        System.out.println("capacity after add = " + v.capacity());

        v.addElement(321);
        v.addElement(444);
        v.addElement(555);
        v.addElement(444);
        System.out.println("size after addElement = " + v.size());
        System.out.println("capacity after addElement = " + v.capacity());

        //iteration through Enumeration
        System.out.println("Iteration through Enumeration ");
        Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

//        setSize() -> this will reduce or increase the size and remove elements if size reduced but more element there
//        v.setSize(5) ;
//        System.out.println("size after setSize(5) = " + v.size());
//        System.out.println(v);

//        contains()
        System.out.println("contains 666 = " + v.contains(666));
        System.out.println("contains 555 = " + v.contains(555));

//        containsAll()
        ArrayList <Integer> al = new ArrayList<>() ;
        al.add(555) ;
        al.add(321) ;
        System.out.println("al = " + al);
        System.out.println("containsAll(al) = " + v.containsAll(al));

//        isEmpty()
        System.out.println(" is v empty ? " + v.isEmpty());
        System.out.println("is v1 empty ? " + v1.isEmpty());

//        elementAt()
        System.out.println("elementAt(2) = " + v.elementAt(2));

//        get()
        System.out.println("get(4) = " + v.get(3));

//        firstElement
        System.out.println("first element = " + v.firstElement());

//        lastElement
        System.out.println("last element = " + v.lastElement());

//        removeElement -> remove first occurrence
//        System.out.println("removing 444 " + v.removeElement(444));
//        System.out.println(v);

//        removeAll(Collection c) -> remove every occurrence
        System.out.println("removeAll() = " + v.removeAll(al));
        System.out.println(v);

////       setElementAt
        v.setElementAt(333, 3);
        v.setElementAt(99, 1);
        v.setElementAt(324, 2);
        v.setElementAt(77, 4);
        System.out.println(v);

//        subList
        System.out.println("subList = " + v.subList(1,5));
        System.out.println("subList = " + v.subList(1,1)); //returns empty

////        remove range of elements from list
//        v.subList(1,4).clear();
//        System.out.println("remove range of sublist = " + v);

//        sorting
        Collections.sort(v);
        System.out.println("after sorting = " + v);

//        indexOf() -> returns index of first occurrence
        System.out.println("indexOf(444) " + v.indexOf(444));

//        indexOf(element, starting index)
        System.out.println("indexOf(444) " + v.indexOf(444, 2));

//        lastIndexOf()
        System.out.println("lasIndexOf() = " + v.lastIndexOf(444));

//        lastIndexOf(element, index starting from last) -> searching backwards
        System.out.println("lasIndexOf() = " + v.lastIndexOf(444, 3));
        System.out.println("lasIndexOf() = " + v.lastIndexOf(444, 5));

//        copy elements of one vector to another
        v1.add(111);
        v1.add(222);
        v1.add(333);
        v1.add(444);
        System.out.println("v before copy = " + v);
        System.out.println("v1 = " + v1);
        Collections.copy(v, v1); //it copies elements and replaces the existing elements of second vector
        System.out.println("v after copy = " + v);







    }
}
