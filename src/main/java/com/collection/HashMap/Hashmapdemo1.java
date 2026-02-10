package com.collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapdemo1 {
    public static void main(String[] args) {
        //HashMap m = new HashMap();
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(101,"John");
        m.put(102,"Surya");
        m.put(103,"sushant");
        m.put(104,"Shivam");
        m.put(105,"Saurabh");
        m.put(103,"X"); //old value replace with new value;
        m.put(106,"Surya");

        System.out.println(m);
        //{101=John, 102=Surya, 103=sushant, 104=Shivam, 105=Saurabh}
        //{101=John, 102=Surya, 103=X, 104=Shivam, 105=Saurabh}
        //{101=John, 102=Surya, 103=X, 104=Shivam, 105=Saurabh, 106=Surya}

        System.out.println(m.get(105));     //Saurabh

        m.remove(106); //remove pair from hashmap
        System.out.println(m);
//        {101=John, 102=Surya, 103=X, 104=Shivam, 105=Saurabh}

        System.out.println(m.containsKey(101));     //true
        System.out.println(m.containsKey(106));     //false

        System.out.println(m.containsValue("Surya"));       //true
        System.out.println(m.isEmpty());        //false

        System.out.println(m.keySet()); //return all the keys as Set
        //[101, 102, 103, 104, 105]

        System.out.println(m.values()); //return all the values as Collection
        //[John, Surya, X, Shivam, Saurabh]

        System.out.println(m.entrySet());   //Return all the entries as Set
        //[101=John, 102=Surya, 103=X, 104=Shivam, 105=Saurabh]

        for (int x : m.keySet()){
            System.out.print(x+" ");    //101 102 103 104 105

        }
        System.out.println(m.values()); //return all the values as Collection
        //[John, Surya, X, Shivam, Saurabh]

        for (Object i: m.values()){
            System.out.print(i+"   ");
            //John   Surya   X   Shivam   Saurabh
        }

        System.out.println(m.keySet()); // [101, 102, 103, 104, 105]

    for (Object i: m.keySet()){
        System.out.println(i + "     "+ m.get(i));

//        101     John
//        102     Surya
//        103     X
//        104     Shivam
//        105     Saurabh
    }


    //Entry method
        //********
        for (Map.Entry entry : m.entrySet()){
            System.out.println(entry.getKey()+ "      " + entry.getValue());
//            101      John
//            102      Surya
//            103      X
//            104      Shivam
//            105      Saurabh
        }

        System.out.println("*************");

        //itertor()

        Set s = m.entrySet();

        Iterator itr = s.iterator();

//        while(itr.hasNext()) {
//            Map.Entry entry = (Entry) itr.next();
//               // 101 x entry
//        }


    }

}
