package com.java.collections.ArrayList;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialize {

    public static void main(String[] args) {

        ArrayList <String> al = new ArrayList<>();
        al.add("hi");
        al.add("hello");
        al.add("hola");

        try{
            FileOutputStream fos = new FileOutputStream("myfile"); // creating a reference to a file named myfile
            ObjectOutputStream oos = new ObjectOutputStream(fos); //fos is passed as parameter as deestination where oos will write the stream
            oos.writeObject(al); //al will converted into Stream of bytes ; which will be in memory
            oos.close();
            fos.close();

        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }


    }
}