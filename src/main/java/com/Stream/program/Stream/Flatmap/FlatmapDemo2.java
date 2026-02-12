package com.Stream.program.Stream.Flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Jony","Kitty");

        List<List<String>> playerInWorldCup = new ArrayList<List<String>>();
        playerInWorldCup.add(teamA);
        playerInWorldCup.add(teamB);
        playerInWorldCup.add(teamC);

//        //Before Java8
//        for(List<String> team : playerInWorldCup){
//            for(String name : team){
//                System.out.println(name);
//            }
//        }

        playerInWorldCup.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());

        System.out.println(playerInWorldCup);
    }
}
