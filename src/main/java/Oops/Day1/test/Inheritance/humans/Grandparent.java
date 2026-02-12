package Oops.Day1.test.Inheritance.humans;

public class Grandparent {


    private String name;

    private int age;

    public boolean hasHasSuperPowers() {
        return hasSuperPowers;
    }

//    public void setHasSuperPowers(boolean hasSuperPowers) {
//        this.hasSuperPowers = hasSuperPowers;
//    }

    private boolean hasSuperPowers;

    public Grandparent(int age, String name){
        this.age = age;
        this.name = name;
        hasSuperPowers = true;
        System.out.println("GrandParent constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
