package com.collection.PrioritQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

//        PriorityQueue q = new PriorityQueue();

        LinkedList q = new LinkedList();
        // Adding elements add() offer()

        q.add("A");
        q.add("B");
        q.add("C");

        q.offer(100); //not allow in queue (hetrogenious data)
        q.offer("C");

        System.out.println(q);      //[A, B, C, C] //insertionorder preserverd & duplicates allowed

        //get head element element() peek()

//        System.out.println(q.element()); // A Return Head Element, if empty return NoSuchElementException
//
//        System.out.println(q.peek());       //null if empty  //A REturn Head element, if empty return null


        //Return & remove element from queue remove() poll()

//        System.out.println(q.remove()); //A
//        System.out.println(q);  //[B, C, C]


//        System.out.println(q.poll());   //A
//        System.out.println(q);      //[B, C, C]


//        Iterator it = q.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
////            A
////                    B
////            C
////                    C
//
//
//        }

//        for(Object e : q){
//            System.out.println(e);
//        }

        System.out.println(q.poll());       //A
        System.out.println(q);  //[B, C, 100, C]

    }
}
