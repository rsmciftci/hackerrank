package easy;

import java.util.HashMap;
import java.util.Map;

class HappyLadyBugs {

    // https://www.hackerrank.com/challenges/happy-ladybugs/problem

    public static String happyLadybugs(String b) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = b.toCharArray();

        for (char ch : b.toCharArray()) {
            boolean containsKey = map.containsKey(ch);

            if (!containsKey) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }

        }

        for(Character ch : map.keySet()){
            if(map.get(ch) == 1 && ch != '_') return "NO";
        }

        boolean containsUnderscore = map.containsKey('_');
        // String Without Underscore
        if (!containsUnderscore) {

            

            int pair = 0;
            for (int i = 0; i < charArray.length - 1; i++) {
                if (charArray[i] != charArray[i + 1]) {
                    pair++;
                    if (pair > 1) {
                        return "NO";
                    }
                }else
                {
                    pair = 0;
                }

            }
            return "YES";

        }

        return "YES";

    }

    public static void main(String[] args) {
        System.out.println(happyLadybugs("AABBC"));

    }
}