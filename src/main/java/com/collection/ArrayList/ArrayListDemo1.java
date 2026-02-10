package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Declare ArayList
        // ArrayList <Integer> al = new ArrayList<Integer>();
        //ArrayList <String> al = new ArrayList<String>();
        //List al = new ArrayList();

        ArrayList al = new ArrayList<>();

        //Add new elements to the arrayList

        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al); //[100, welcome, 15.5, A, true]

    //size()
        System.out.println("Number of elements in array list:" + al.size()); //Number of elements in array list:5

        //remove()
       // al.remove(1);
        //here 1 is index
      al.remove("welcome"); // here welcome is element

        System.out.println("After removing element from array list" + al);
        //After removing element from array list[100, 15.5, A, true]


        //insert a new element
        //add(index, object)

        al.add(2,"python");
        System.out.println("after inserting new Array element:"+al);
        //after inserting new Array element:[100, 15.5, python, A, true]

        //retreive specific element
        System.out.println(al.get(2));      //python

        al.set(2,"C#");
        System.out.println("After replacing element:"+al);
        //After replacing element:[100, 15.5, C#, A, true]

        //serach = contain() - REturns true/ false
        System.out.println(al.contains("C#")); //true
        System.out.println(al.contains("C++")); //false

        //isEmpty()
        System.out.println(al.isEmpty()); //false


        //1) for loop
//        System.out.println("Reading elements using for loop......");
//
//        for(int i = 0;i<al.size();i++){
//            System.out.println(al.get(i));
//        }

        //2)for..each loop
//        System.out.println("Reading elements using for ..each loop");
//        for(Object e : al){
//            System.out.println(e);
//        }
//

        //3) iterator()
        System.out.println("Reading elements using iterator method");

        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
