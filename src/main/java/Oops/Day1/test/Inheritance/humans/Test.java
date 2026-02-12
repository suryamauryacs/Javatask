package Oops.Day1.test.Inheritance.humans;

import Oops.Day1.test.Cat;
import Oops.Day1.test.Inheritance.Animal.Dog;

public class Test {
    public static void main(String[] args) {
//        Child child = new Child();      //Multilevel inheritance
//
//        child.setAge(8);
//        child.setName("Ram");
//
//        Parent parent = new Parent();
//        parent.setAge(30);
//        parent.setName("Museshd");
//
//        Dog dog = new Dog();
//        Cat cat = new Cat();


//        Child  child = new Child();
//        child.childMethod();
//        child.setAge(12);
       // System.out.println(child.hasHasSuperPowers());

        Child child = new Child(42, "Shyam");
        System.out.println(child.getAge());
       child.childMethod();



    }
}
