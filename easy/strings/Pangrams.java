package easy.strings;

import java.util.*;

// https://www.hackerrank.com/challenges/pangrams/problem?h_r=next-challenge&h_v=zen&isFullScreen=false

public class Pangrams {

    public static String pangrams(String s) {

        if(s.length() < 26){
            return "not pangram";
        }

        String str = s.toUpperCase();
        List<Character> list = Arrays.asList('A', 'E', 'I', 'O', 'U', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z', 'W', 'Y');

        List<Character> strList = new ArrayList<Character>();

        for (Character ch : str.toCharArray()) {
            boolean containsKey = strList.contains(ch);
            if (!containsKey) {
                strList.add(ch);
            }
        }

        for (Character ch : list) {
            boolean contains = strList.contains(ch);
            if (!contains) {
                return "not pangram";
            }
        }

        return "pangram";

    }

    public static void main(String[] args) {
        String string = "We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(string));


    }
}
