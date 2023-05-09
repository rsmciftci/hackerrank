package easy.strings;

import java.util.*;

public class FunnyString {

    // https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true
    // 20:13

    public static String funnyString(String s) {
        // Write your code here
        char[] charArray = s.toCharArray();
        List<Integer> diffArr = new ArrayList<Integer>();

        for (int i = 0; i < charArray.length-1; i++) {
        
            char ch1 = charArray[i];
            char ch2 = charArray[i+1];

            int int1 = (int) ch1;
            int int2 = (int) ch2;

            int diff = Math.abs(int1 - int2);
            diffArr.add(diff);

        }

        for(int i = 0; i < diffArr.size()/2; i++) {
            int left = diffArr.get(i);
            int right = diffArr.get(diffArr.size()-1-i);

            if(left != right){
                return "Not Funny";
            }
        }

        return "Funny";


    }

    public static void main(String[] args) {

        String str = "bcxz";
        System.out.println(funnyString(str));

    }

}
