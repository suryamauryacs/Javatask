package Oops.Day1.test.Inheritance.humans;

public class Parent extends Grandparent{
    public Parent(int age, String name){
        super( age, name);
        System.out.println("parent constructor called");
    }

    public void parentMethod(){
        System.out.println("Parent method called");
    }
}
