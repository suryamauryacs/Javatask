package com.Stream.program.Stream.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Malisandre", "Sansa","Jon","Daenerts","Joffery");

        List<String> longname = new ArrayList<String>();

//        longname = names.stream().filter(str -> str.length() > 6 && str.length() < 8).collect(Collectors.toList());
//        System.out.println(longname);

//        names.stream().filter(str -> str.length() > 6 && str.length() <8).forEach(str -> System.out.print(str));
        names.stream().filter(str -> str.length() > 6 && str.length() < 9).forEach(System.out::println);
    }
}
