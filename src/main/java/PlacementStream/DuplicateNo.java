package PlacementStream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;

//✅ 1. Find duplicate elements in a list
public class DuplicateNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array like : [12,,2,3,4]: ");
        String str = sc.nextLine();

        List<Integer> lst = Arrays.asList(1,2,3,4,1,3,4,5,6);
        Set<Integer> dup = lst.stream().filter(i -> Collections.frequency(lst, i) > 1).collect(Collectors.toSet());

        System.out.println(dup);
    }

//    public static int[] duplicate(int[] arr){
//        Set<Integer> dup = new HashSet<>();
//
//        dup = Arrays.stream(arr).filter(i -> Collections.frequency(arr, i) > 1).collect(Coll)
//    }

}
