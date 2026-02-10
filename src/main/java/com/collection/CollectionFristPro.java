package com.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class CollectionFristPro {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//       ArrayList<Integer> lst = new ArrayList<>();
//       lst.add(1); //0
//       lst.add(5);  //1
//       lst.add(80); //2
//

//       ArrayList<Integer> lst2 = new ArrayList<>(1000);
//        System.out.println(lst2.size());
//      //  System.out.println(lst2.get(0));

        ArrayList<Integer> lst3 = new ArrayList<>(11);
        lst3.add(1);
        lst3.add(2);
        lst3.add(3);
        lst3.add(4);
        lst3.add(5);
        lst3.add(6);lst3.add(7);lst3.add(9);lst3.add(9);
        lst3.add(10);
        lst3.add(11);

        System.out.println(lst3.size());

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(lst3);
        System.out.println("ArrayList capacity: " + elementData.length);

        lst3.add(1);

        elementData = (Object[]) field.get(lst3);
        System.out.println("ArrayList capacity: " + elementData.length);










      //  lst.add(2, 59);
//        lst.set(2,50);
//
//        for(int x : lst){
//            System.out.println(x);;
//        }



//        System.out.println(lst.get(2));
//        System.out.println(lst.size());
//
//        for(int i = 0;i<lst.size();i++){
//            System.out.println(lst.get(i));;
//        }




    }
}
