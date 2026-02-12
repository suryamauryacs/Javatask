package Oops.Day1.test.Inheritance.humans;

public class Child extends Parent{
    public Child(int age, String name){
    super(age, name);
        // super();
        System.out.println("Child constructor called");
    }

    public void childMethod(){
        System.out.println("Child method called");
        super.parentMethod();
    }
}
