package apnacollegesheetdsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


//      Your approach uses Divide and Conquer to find Min and Max.

//       num = [4,1,8,2,9]
//        [1, 9]

//  nums = [-10,-5,-2,-20]s
//  [-20, -2]


//      T(n) = 2T(n/2) + O(1)2``
//      ✅ Time Complexity = O(n)
//          Recursive stack height:     log₂(n)     ✅ Space Complexity = O(log n)
public class FindMaxMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Araay like [1,2,3]: ");
        String input = sc.nextLine();

        int[] arr = Arrays.stream(input.substring(input.indexOf("[")+1, input.indexOf("]")).split(","))
                .filter(st -> !st.isEmpty()).map(String :: trim).mapToInt(Integer:: parseInt).toArray();

//        Integer[] arr = {1, 2, 3, 4};2
//        ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(arr));  // only


//        ArrayList<Integer> newArr = new ArrayList<>();
//          for (int num : arr) {
//          newArr.add(num);
//}

        ArrayList<Integer> newArr = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(findMinMax(newArr));
    }

    public static ArrayList<Integer> findMinMax(ArrayList<Integer> arr){
        return getMinMax(arr,0, arr.size() -1);
    }

    public static ArrayList<Integer> getMinMax(ArrayList<Integer> arr, int low, int high){
        //Base case : one element
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(0,0));
        if(low == high){
            res.set(0, arr.get(low));
            res.set(1, arr.get(low));
            return res;
        }

        //base Case : two element:-

        if(high == low + 1){
            if(arr.get(low) < arr.get(high)){
                res.set(0, arr.get(low));
                res.set(1, arr.get(high));
            }

            else{
                res.set(0, arr.get(high));
                res.set(1, arr.get(low));
            }

            return res;
        }

        //recursive Case : divide array into two halves:

        int mid = (low + high)/2;
        ArrayList<Integer> left = getMinMax(arr, low, mid);
        ArrayList<Integer> right = getMinMax(arr, mid + 1, high);

        //combine res
        int min = Math.min(left.get(0) , right.get(0));
        int max = Math.max(left.get(1), right.get(1));

        res.set(0, min);
        res.set(1, max);

        return res;
    }
}
