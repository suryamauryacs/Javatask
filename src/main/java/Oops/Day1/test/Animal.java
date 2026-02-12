package Oops.Day1.test;

public class Animal {
    String name;
    int age;

    public void makeSound(){
        System.out.println("Some sound");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Animal eats food");
    }
}
