package com.java.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialize {

    public static void main(String[] args) {

        ArrayList <String> al2 = new ArrayList<>() ;

        try{
            FileInputStream fis = new FileInputStream("myfile");
            ObjectInputStream ois = new ObjectInputStream(fis) ;
            al2 = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }
        catch(IOException ioe){
        ioe.printStackTrace();
        }
        catch(ClassNotFoundException c){
        c.printStackTrace();
        return;
        }

        for(String tmp : al2){
        System.out.println(tmp);
    }
    }
}