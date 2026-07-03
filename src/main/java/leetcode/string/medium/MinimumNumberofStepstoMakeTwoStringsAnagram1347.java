package leetcode.string.medium;

public class MinimumNumberofStepstoMakeTwoStringsAnagram1347 {
    public static void main(String[] args) {

    }

    public int minSteps(String s, String t) {
        int[] freq = new int[26];

        for(int c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int c : t.toCharArray()){
            freq[c - 'a']--;
        }

        int step = 0;
        for(int count : freq){
            if(count > 0){
                step += count;
            }
        }

        return step;
    }


}
