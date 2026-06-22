package com.designpattern.day1;

public class Example {

    public static void main(String[] args) {

        Samosa samosa = Samosa.getSomosa();

        System.out.println(samosa.hashCode());

        Samosa samosa2 = Samosa.getSomosa();

        System.out.println(samosa2.hashCode());
    }
}
