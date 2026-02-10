package com.collection.HashMap;



import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
//        Hashtable t = new Hashtable(); //capacity is l1, load factor 0.75

//        Hashtable t = new(intial capacity); //craete hashtable object with some capacity

//        Hashtable t = new Hashtable(intial capacity, fill ratio/load factor);

        Hashtable <Integer, String> t = new Hashtable<Integer, String>();

        t.put(101,"John");
        t.put(102,"David");
        t.put(103,"smith");

//        t.put(null,"X");  // Cannot invoke "Object.hashCode()" because "key" is null
        //NullPointerException
//        t.put(104, null);   //NullPointerException

        System.out.println(t);  //{103=smith, 102=David, 101=John}


        System.out.println(t.get(103)); //smith

        System.out.println(t.containsKey(102)); //true
        System.out.println(t.containsKey(105)); //false

        System.out.println(t.containsValue("David")); //true
        System.out.println(t.containsValue("Y"));   //false

        System.out.println(t.isEmpty());    //false

        System.out.println(t.keySet());
        System.out.println(t.values());

//        for (int k : t.keySet()){
//            System.out.println(k + "    " + t.get(k));
//
////            103    smith
////            102    David
////            101    John
//        }

        //entry specific method...

//        for(Map.Entry entry:t.entrySet()){  //(key, vlaue)
//
//            System.out.println(entry.getKey() + "     "+entry.getValue());
//        }

        //Itertor()

        Set s = t.entrySet();

        Iterator its = s.iterator();

        while(its.hasNext()){
            Map.Entry entry = (Map.Entry) its.next();
            System.out.println(entry.getKey() + "       "+ entry.getValue());
        }
    }

}
