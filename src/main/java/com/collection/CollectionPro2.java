package com.collection;

import java.util.*;


class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2){
        return 0;
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2){
        return o2-o1;
    }
}

// 5 3
// 3 5
public class CollectionPro2 {





    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        System.out.println(list1.getClass().getName());
//        list1.set(1,"Wednesday");
//        System.out.println(list1.get(1));
//
//        String[] array = {"Apple", "Banana", "Cherry"};
//        List<String> list2 = Arrays.asList(array);
//        System.out.println(list2.getClass().getName());
//
//        List<String> list4 = new ArrayList<>(list2);
//        list4.add("Mango");
//        System.out.println(list4);

      //  List<Integer> list3 = List.of(1,2,3,4);
       // list3.set(1,33); not posible to change because immutable method List.of



        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(33);

      //  list.sort(null);

        list.sort(new MyComparator());
        System.out.println(list);

        for(int x : list){
            System.out.println(x);
        }



//        list.remove(1);
//        System.out.println(list);

//        list.remove(Integer.valueOf(1));
//        System.out.println(list);


//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);




//        list.add(0, 0);
//        System.out.println(list);
//
//        List<Integer> list1 = List.of(4,5,6,7,8,9);

//        list1.addAll(list1);
//        System.out.println(list);


        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Banana");
        fruits.add("Apple");





    }
}
