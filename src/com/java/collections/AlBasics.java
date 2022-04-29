// DISCLAIMER :- this code contain basics and all operations on ArrayList

//AL can't store primitive data types (int,char, double,long)
//Integer, String, Long, Float, Double, Boolean, Character, Byte, Short

import java.util.ArrayList ;
import java.util.Collections ;
import java.util.List ;

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
        System.out.println("index of element");
        System.out.println(al.indexOf("Rahul")); //indexOf () have int return type
        System.out.println(al.indexOf("Sakib")); //return -1 as element not found

        //contains()
        System.out.println(al.contains("Sakib")); //false for not found
        System.out.println(al.contains("Rahul")); //true for found

    }

}