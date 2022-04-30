// DISCLAIMER :- this code contain basics and all operations on ArrayList

//AL can't store primitive data types (int,char, double,long)
//Integer, String, Long, Float, Double, Boolean, Character, Byte, Short

package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class AlBasics {

    public static void main(String args[]){

        ArrayList <String> al = new ArrayList<> () ;
        // using list to declare arraylist syntax check and confirm
        // List <Integer> li = new List<>();

        //adding elements
        al.add("Samuel");
        al.add("Arman");
        al.add("Pomila");
        al.add("Ritvik");
        al.add("Daneil");

        //printing elements
        System.out.println(al);

        //get specific elements
        System.out.println(al.get(1)); //passing index in the parameter

        //adding element in between the indexes
        al.add(1,"Ramez");
        System.out.println(al);

        //set element - replacing element
        al.set(1, "Rahul");
        System.out.println(al);

        //delete element
        al.remove(2) ; //passing index
        System.out.println(al);

        al.remove("Ritvik"); //passing value
        System.out.println(al);

        //size of AL
        System.out.println(al.size()); //returns size of int type

        //iteration - for loop
        System.out.println("Iteration using for loop");
        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }

        //iteration - for each loop
        System.out.println("Iteration using for each loop");
        for(String i : al){
            System.out.print(i + " ") ;
        }
        System.out.println() ;

        //sorting
        Collections.sort(al) ; //by default ascending
        System.out.println(al);

        Collections.sort(al, Collections.reverseOrder()); // descending order
        System.out.println(al);

        //index of
        //if there's a multiple occurrence it'll return the first occurrence only
        System.out.println("index of element");
        System.out.println(al.indexOf("Rahul")); //indexOf () have int return type
        System.out.println(al.indexOf("Sakib")); //return -1 as element not found

        //contains()
        System.out.println(al.contains("Sakib")); //false for not found
        System.out.println(al.contains("Rahul")); //true for found

        //clear() - this will remove all the elements in one go
        al.clear() ;
        System.out.println(al);

        //initialization using Arrays.asList()
        System.out.println("Aslist: -");
        ArrayList <Integer> al2 = new ArrayList (Arrays.asList(1,2,3,4));
        System.out.println(al2);

        int arr[] = new int[]{2,3,4,5} ;
        System.out.println("toString = " + Arrays.toString(arr));
        int i=0;
        while(arr.length > i){
            System.out.println(arr[i]);
            i++;
        }
        ArrayList<Integer> al22 = new ArrayList(Arrays.asList(arr));
        System.out.println("al22 = "+ al22);
        Object obj = al22.get(0);
        System.out.println("obj = "+ obj);
//        System.out.println(Arrays.toString(obj));
        //why in above line, object type can't be converted to String type ?
        //where, toString() takes object as paramter ??

        int result[] = (int[]) obj; //typecasting into int[] because at run time obj will have int arr[]
        System.out.println(Arrays.toString(result)); //deepToString() will be used for string reps. of
                                                    //multi-dimension array


        //initialization - anonymous inner class method
        ArrayList <Float> al3 = new ArrayList <Float>() {{add(2.3f); add(3.2f); add(.32f); }};
        System.out.println(al3);

        //Collections.ncopies - intitalize same values for all elements
        ArrayList <Integer> al4 = new ArrayList<>(Collections.nCopies(5,33)); //here, 5 times 33
        // Collections.nCopies(count, element)
        System.out.println(al4);

        //looping using iterator
        System.out.println("Looping using iterator :-");
        Iterator it = al4.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //iteration through Enumeration interface
        System.out.println("Iteration using Enumeration");
        Enumeration <Integer> e = Collections.enumeration(al4);
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        //addAll - add all elements of one list into another
        al4.addAll(al2) ; //adding al2 into al4
        System.out.println("After adding al2 in al4:- ");
        System.out.println(al4);

        //adAll - at specified location
        al4.addAll(3,al2); //passing index from which insertion will take place
        System.out.println("addAll from specified index:- ") ;
        System.out.println(al4);

        //sublist
        System.out.println("Sublist:- ");
        System.out.println(al4.subList(3,7)); // from index inclusive, to index exclusive

        //sublist return type is list
        //therefore:- i. typecast into arraylist
        //            ii. storing in list

        ArrayList <Integer> al5 = new ArrayList<>(al4.subList(4,8)); //approach i.
        System.out.println("al5 " + al5);

        List <Integer> li = al4.subList(6,10); //approach ii.
        System.out.println("List :- "+ li) ;

        //lastIndexOf - returns the last index of occurrence of element
        System.out.println("Last index of 33:- "+ al4.lastIndexOf(33));
        System.out.println("Index of 5 = "+ al4.indexOf(5));

        //comparing arraylist
        //using contains()

        ArrayList <Integer> al6 = new ArrayList<> () ;
        ArrayList <Integer> al7 = new ArrayList<> () ;

        al6.add(23);
        al6.add(32);
        al6.add(12);

        al7.add(23);
        al7.add(32);
        al7.add(45);

        //approach i. Storing the comparison in Integer ArrayList
        ArrayList <Integer> c = new ArrayList<>() ;
        for(Integer ia : al6)
            c.add(al7.contains(ia) ? 1 : 0 ) ;
        System.out.println(c) ;

        //approach ii. Storing the comparison in String ArrayList
        ArrayList <String> d = new ArrayList<>();
        for(Integer ia : al7)
            d.add(al6.contains(ia) ? "Yes" : "No");
        System.out.println(d) ;




    }

    }