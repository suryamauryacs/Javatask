package com.collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //HashSet hs = new HashSet(); // default capacity 16 load Factor 0.75

        //HashSet hs = new HashSet(100);    //initial capcity 100

        //HashSet hs = new HashSet(100, (float)0.99);

        //HashSet  <Integer> hs = new HashSet<Integer>();

        HashSet hs = new HashSet();

        //Add object/ eleemnts into HashSet
        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);

        System.out.println(hs);     //[null, A, 100, 16.4, welcome, true]

        hs.remove(16.4);
        System.out.println("After removing element:"+hs);
        //After removing element:[null, A, 100, welcome, true]

        //contain()

        System.out.println(hs.contains("welcome"));
        System.out.println(hs.contains("xyz"));

        System.out.println(hs.isEmpty());

        //Reading objects/elements from hashSet using for ..each loop

//        for(Object e : hs){
//            System.out.println(e);
//        }

//        Iterator it = hs.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


    }
}
