package com.java.collections;

import java.util.*;

public class HashMapMain {

    /**
     * LRU cache, LFU cache
     */
    /**
     * @param args map has unique keys
     *             ROLL NO (KEY) | NAME (VALUE)
     *             <p>
     *             10  | SAROJ ENTRY
     *             11 | SANGITA ENTRY
     *             12 | RITU ENTRY
     *             <p>
     *             <p>
     *             ===============
     *             <p>
     *             10 | 10 remove(10)
     *             20 | 10
     */
    public static void main(String[] args) {

        Map<Integer, String> rollNumVsName = new HashMap<>();
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
        containsKey(rollNumVsName);
        countFrequency();
        groupByMap();
    }

    public static void groupByMap() {
        // 75 | 1,2
        // 70 | 3, 4
        Student s1 = new Student();
        s1.rollNum = 1;
        s1.marks = 75;

        Student s2 = new Student();
        s2.rollNum = 2;
        s2.marks = 75;

        Student s3 = new Student();
        s3.rollNum = 3;
        s3.marks = 70;

        Student s4 = new Student();
        s4.rollNum = 4;
        s4.marks = 70;
        Student[] stdArr = {
                s1, s2, s3, s4
        };
        // Marks, Values (list of rollNums)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (Student s : stdArr) {
            if (map.containsKey(s.marks)) {
               List<Integer> rollNums = map.get(s.marks);
               rollNums.add(s.rollNum); // 75 | [1,2]
            } else {
                List<Integer> rollNums = new ArrayList<>();
                rollNums.add(s.rollNum);
                map.put(s.marks, rollNums); // 75 | [1]
            }
        }
        System.out.println(map);
    }

    public static class Student {
        int rollNum;
        int marks;
    }

    public static void countFrequency() {
        int[] arr = {1, 2, 3, 1, 2, 4};
        /**
         * 1 = 2
         * 2 = 2
         * 3 = 1
         * 4 = 1
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                map.put(i, count + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }

    public static void containsKey(Map<Integer, String> map) {
        System.out.println(map.containsKey(14));
        System.out.println(map.containsKey(100));
    }

    public static void deleteMany(Map<Integer, String> map) {
        /**
         * Exception in thread "main" java.util.ConcurrentModificationException
         * 	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1445)
         * 	at java.util.HashMap$EntryIterator.next(HashMap.java:1479)
         * 	at java.util.HashMap$EntryIterator.next(HashMap.java:1477)
         * 	at com.java.collections.HashMapMain.deleteMany(HashMapMain.java:43)
         * 	at com.java.collections.HashMapMain.main(HashMapMain.java:37)
         */
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            String valueToBeDelete = "SAROJ";
            if (valueToBeDelete.equals(value)) {
                map.remove(key);
            }
        }
    }

    public static void add(Map<Integer, String> map) {
        map.put(10, "SAROJ");
        map.put(14, "SAROJ");
        map.put(16, "SAROJ");
        map.put(12, "SANGITA");
        map.put(11, "RITU");
    }

    public static void update(Map<Integer, String> map) {
        map.put(10, "SAMEER");
        map.putIfAbsent(12, "SRIYA");
        map.putIfAbsent(13, "SRIJIT");
    }

    public static void delete(Map<Integer, String> map) {
        map.remove(10); // key
        map.remove(15); // key
    }

    public static void display(Map<Integer, String> map) {
        Set<Integer> rollNums = map.keySet();
        for (Integer key : rollNums) {
            String value = map.get(key); // key
            System.out.println(key + " " + value);
        }
    }

    // 10,11,12
    public static void display_1(Map<Integer, String> map) {
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
