package com.java.collections.ArrayList;

import java.util.ArrayList;

//here joining/combining two ArrayList by using addAll()

public class JoinArrayList {

    public static void main(String[] args) {

        ArrayList <String> al = new ArrayList<>();
        al.add("DAV");
        al.add("JNV");
        al.add("KV");

        System.out.println("al = "+ al);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("Ram");
        al2.add("Sam");
        al2.add("Kiran");

        System.out.println("al2 ="+ al2);

        ArrayList <String> al3 = new ArrayList<>();
        al3.addAll(al);
        al3.addAll(al2);
        al.addAll(al3);
        System.out.println("al3 = "+ al3);
        System.out.println("al = "+ al);

    }
}
