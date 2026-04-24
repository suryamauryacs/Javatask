package Sinleton.Part1.part2;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Single instance created");
    }

    public static synchronized Singleton getInstace(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Heloow From singleton");
    }
}
