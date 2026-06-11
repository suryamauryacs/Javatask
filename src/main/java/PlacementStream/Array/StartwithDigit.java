package PlacementStream.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class StartwithDigit {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Array like [1,2,3]: ");
            String input = sc.nextLine();

            int[] arr = strToArr(input);

            System.out.println(startwithDigit(arr));
        }

        public static Stream<String> startwithDigit(int[] arr){
            return Arrays.stream(arr).mapToObj(String :: valueOf).filter(s -> s.startsWith("5"));
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
