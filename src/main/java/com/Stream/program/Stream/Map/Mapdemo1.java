package com.Stream.program.Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicyle","fight","train");
        List<String> vehiclesListinUpperCase = new ArrayList<String>();

//        for(String name: vehicles){
//            vehiclesListinUpperCase.add(name.toUpperCase());
//        }
//
//        System.out.println(vehiclesListinUpperCase);
//    }

        vehiclesListinUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(vehiclesListinUpperCase);
}}
