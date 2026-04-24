package Sinleton.Part1.part2;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstace();
        Singleton s2 = Singleton.getInstace();

        System.out.println(s1 == s2);
        s1.showMessage();
    }
}
