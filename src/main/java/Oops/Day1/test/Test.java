package Oops.Day1.test;

import Oops.Day1.test.Vehicle.Car;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

//        car.color = "Blue";
//        car.speed = 40;
//        car.brand = "Tata";
//       // car.year = 2024;
//
//        car.model = "Safari";
//
//        car.accelerate(1);
//
//        System.out.println(car.speed);
//
//        Cat cat = new Cat();
//        cat.name = "Bob";
//        System.out.println(cat.name);
//
//        Animal dog = new Dog();
//
//        dog.makeSound();

//        Cat a = new Cat();
//        a.name = "Bob";
//       // Cat cat = makeCatNameUpperCase(a);
//       // System.out.println(cat.name);
//        makeCatNameUpperCase(a);
//        System.out.println(a.name);


     //   System.out.println(sum(1,2,3,4,5));

      //  System.out.println(sum(new int[]{1,2,3})); not need to craetae aaray

//        System.out.println(isPrime(14));
//        System.out.println(isPrime(91));
//        System.out.println(isPrime(71));


    }

    public static boolean isPrime(int x){
        int res = 0;
        for(int i = 1;i<x/2;i++){
            if(x %i == 0){
                res++;
            }
        }

        return res == 1;
    }

    public static int sum(int ...a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;

    }

        public static void makeCatNameUpperCase(Cat cat){
            cat.name = cat.name.toUpperCase();
            //return cat;
        }





}
