package easy.strings;

import java.util.*;

class MakingAnagrams {

    public static int makingAnagrams(String s1, String s2) {

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (char ch : s1.toCharArray()) {
            boolean containsKey = map1.containsKey(ch);
            if (!containsKey) {
                map1.put(ch, 1);
            } else {
                map1.put(ch, 1 + map1.get(ch));
            }
        }

        for (char ch : s2.toCharArray()) {
            boolean containsKey = map2.containsKey(ch);
            if (!containsKey) {
                map2.put(ch, 1);
            } else {
                map2.put(ch, 1 + map2.get(ch));
            }
        }

        int numberOfCharsToBeDeleted = 0;
        for (Character ch : map1.keySet()) {

            boolean containsKey = map2.containsKey(ch);

            if (containsKey) {

                Integer timesIn1 = map1.get(ch);
                Integer timesIn2 = map2.get(ch);

                int diff = Math.abs(timesIn1 - timesIn2);
                numberOfCharsToBeDeleted += diff;

            } else {
                Integer timesIn1 = map1.get(ch);
                numberOfCharsToBeDeleted += timesIn1;

            }

        }

        for (Character ch : map2.keySet()) {
            boolean containsKey = map1.containsKey(ch);
            if (!containsKey) {
                numberOfCharsToBeDeleted += map2.get(ch);
            }
        }

        return numberOfCharsToBeDeleted;

    }

    public static void main(String[] args) {

        System.out.println(makingAnagrams("cde", "abc"));

    }
}