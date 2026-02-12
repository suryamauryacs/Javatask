package Oops.Day1.test.Encapsultion;

public class Student {
    private String names;

    private int rollNumber;

    private int age;


//    public Student(){
//        this.age = 10;
//    }

    public Student(String name, int rollNumber, int age){
        this.names = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public Student(String names){
        this.names = names;
    }

    public Student(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid age");
        }
        else{
            this.age = age;
        }
    }
}
