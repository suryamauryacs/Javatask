package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);  //[X, Y, Z, A, B, C]

        al_dup.removeAll(al);
        System.out.println("After removing:"+al_dup); //After removing:[]

        //sort -- Collections.sort()

        System.out.println("Elements in the array list:"+al);  //Elements in the array list:[X, Y, Z, A, B, C]
        Collections.sort(al);
        System.out.println("Elements in the array list after sorting: "+al); //Elements in the array list after sorting: [A, B, C, X, Y, Z]

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After sorting Reverse Order:"+al);
        //After sorting Reverse Order:[Z, Y, X, C, B, A]

        //Shuffling - Collections.shuffle()

        Collections.shuffle(al);
        System.out.println("After Shuffling element:"+al);
        //After Shuffling element:[A, Z, C, Y, X, B]

    }
}
