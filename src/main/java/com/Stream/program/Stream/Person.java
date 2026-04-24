package com.Stream.program.Stream;

public class Person {
    final String name;
    final int age;
    final String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString(){
        return name + "(" + age + "," +"city"+")";
    }
}
