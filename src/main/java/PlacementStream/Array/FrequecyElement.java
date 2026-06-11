package PlacementStream.Array;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FrequecyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array like : [1,2,3]:");
        String input = sc.nextLine();

        int[] arr = strToArr(input);

        System.out.println(Arrays.toString(arr));


        System.out.println(fequency(arr));
    }

    public static Map<Integer, Long> fequency(int[] arr){
        Map<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return freq;
    }

    public static int[] strToArr(String s){
        if(s == null)
            return new int[0];

        s = s.replaceAll("[\\[\\]<>(){}]","");

        if(s.isEmpty())
            return new int[0];

        return Arrays.stream(s.split(",")).map(String :: trim).mapToInt(Integer :: parseInt).toArray();
    }
}
