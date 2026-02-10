package com.Stream.program.Stream.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup",null,"forest","sky","book",null, "theatre");

//        List<String> result = new ArrayList<String>();

        List<String> res = words.stream().filter(w -> w !=null).collect(Collectors.toList());
        System.out.println(res);
    }
}
