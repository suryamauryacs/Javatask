package PlacementStream.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like [1,2,3]: ");
        String input = sc.nextLine();

        int[] arr = strToArr(input);

        System.out.println(secondHiehgest(arr));
    }

    public static int secondHiehgest(int[] arr){
        return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

//        s = s.replaceAll("[\\[\\<>(){}]]","").trim();
        s = s.replaceAll("[\\[\\](){}]", "").trim();

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();

    }
}

//[6000,3000,23000,40000,40000,54000,89000,98440]
