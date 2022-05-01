package com.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMain {

    /**
     *
     * @param args
     *  map has unique keys
     * ROLL NO (KEY) | NAME (VALUE)
     *
     * 10  | SAROJ ENTRY
     * 11 | SANGITA ENTRY
     * 12 | RITU ENTRY
     *
     *
     * ===============
     *
     * 10 | 10 remove(10)
     * 20 | 10
     */
    public static void main(String[] args) {

        Map<Integer,String> rollNumVsName = new LinkedHashMap<>(); // ORDER OF INSERTION OF ENTRY WITH RESPECT TO KEYS
        add(rollNumVsName);
        // display(rollNumVsName);
        display_1(rollNumVsName);
        update(rollNumVsName);
        System.out.println("=======================");
        display_1(rollNumVsName);
        System.out.println("+++++++++++++++++++++++");
        delete(rollNumVsName);
        display_1(rollNumVsName);
        // deleteMany(rollNumVsName);
    }

    public static void deleteMany(Map<Integer,String> map)
    {
        /**
         * Exception in thread "main" java.util.ConcurrentModificationException
         * 	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1445)
         * 	at java.util.HashMap$EntryIterator.next(HashMap.java:1479)
         * 	at java.util.HashMap$EntryIterator.next(HashMap.java:1477)
         * 	at com.java.collections.HashMapMain.deleteMany(HashMapMain.java:43)
         * 	at com.java.collections.HashMapMain.main(HashMapMain.java:37)
         */
        Set<Map.Entry<Integer,String>> entrySet =  map.entrySet();
        for(Map.Entry<Integer,String> entry: entrySet)
        {
            Integer key = entry.getKey();
            String value = entry.getValue();
            String valueToBeDelete = "SAROJ";
            if(valueToBeDelete.equals(value))
            {
                map.remove(key);
            }
        }
    }
    public static void add(Map<Integer, String> map)
    {
        map.put(10,"SAROJ");
        map.put(14,"SAROJ");
        map.put(16,"SAROJ");
        map.put(12,"SANGITA");
        map.put(11,"RITU");
    }

    public static void update(Map<Integer,String> map)
    {
        map.put(10,"SAMEER");
        map.putIfAbsent(12,"SRIYA");
        map.putIfAbsent(13,"SRIJIT");
    }

    public static void delete(Map<Integer,String> map)
    {
        map.remove(10); // key
        map.remove(15); // key
    }

    public static void display(Map<Integer, String> map)
    {
        Set<Integer> rollNums = map.keySet();
        for(Integer key:rollNums)
        {
            String value = map.get(key); // key
            System.out.println(key+" "+value);
        }
    }

    // 10,11,12
    public static void display_1(Map<Integer,String> map)
    {
        Set<Map.Entry<Integer,String>> entrySet =  map.entrySet();
        for(Map.Entry<Integer,String> entry: entrySet)
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
