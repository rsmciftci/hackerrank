package easy.strings;

import java.util.*;

// https://www.hackerrank.com/challenges/gem-stones/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
// 32:00

public class Gemstones {

    public static Set<Character> returnAsSet(String str) {
        Set<Character> set = new HashSet<Character>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        return set;
    }

    public static int gemstones(List<String> arr) {
        // Write your code here

        List<Set<Character>> result = new ArrayList<Set<Character>>();

        for (String str : arr) {
            Set<Character> set = returnAsSet(str);
            result.add(set);
        }

        Set<Character> zerothSet = result.get(0);

        for (int i = 1; i < result.size(); i++) {

            Set<Character> currentSet = result.get(i);
            Set<Character> lettersToRemove = new HashSet<Character>();

            for (Character ch : zerothSet) {
                boolean contains = currentSet.contains(ch);
                if (!contains) {
                    lettersToRemove.add(ch);  // Created letters to removeSet, because if we try to remove here directly, it throws ConcurrentModificationException
                                            // https://www.baeldung.com/java-concurrentmodificationexception
                }

            }

            for (Character ch : lettersToRemove) {
                zerothSet.remove(ch);
            }

        }

        return zerothSet.size();

    }

    public static void main(String[] args) {

        List<String> asList = Arrays.asList("abcdde", "baccd", "eeabg");
        System.out.println(gemstones(asList));

    }

}
