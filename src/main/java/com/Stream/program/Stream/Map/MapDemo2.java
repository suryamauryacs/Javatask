package com.Stream.program.Stream.Map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicyle","fight","train");

        //before java8 / without using stream

//        for(String name: vehicles ){
//            System.out.println(name+" = " +name.length());
//        }

        //using stream

//        vehicles.stream()
//                .map(vname -> vname.length())
//                .forEach(len -> System.out.println(len));
//
        vehicles.stream()
                .map(vname -> vname.length())
                .forEach(System.out::println);


    }
}
