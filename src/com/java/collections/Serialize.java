package com.java.collections;

import java.io.*;
import java.util.ArrayList;

public class Serialize {

    public static void main(String[] args) {

        ArrayList <String> al = new ArrayList<>();
        al.add("hi");
        al.add("hello");
        al.add("hola");

        try{
            FileOutputStream fos = new FileOutputStream("myfile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();

        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }


    }
}