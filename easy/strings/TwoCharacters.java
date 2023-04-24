package easy.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// https://www.hackerrank.com/challenges/two-characters/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

class TwoCharacters {

    public static boolean isConsecutive(String s) {

        if(s.length() < 3) return true;

        for (int i = 0; i < s.length()-2; i++) {

            if (s.charAt(i) != s.charAt(i + 2)) {
                return false;
            }

        }

        return true;
    }

    public static int alternate(String s) {

        Set<Character> charSet = new HashSet<Character>();
        List<Character> charList = new ArrayList<Character>();

        for (char ch : s.toCharArray()) {
            boolean containsChar = charSet.contains(ch);
            if (!containsChar) {
                charSet.add(ch);
                charList.add(ch);
            }
        }

        List<Character> firstChar = new ArrayList<Character>();
        List<Character> secondChar = new ArrayList<Character>();

        for (int i = 0; i < charList.size(); i++) {
            for (int j = i + 1; j < charList.size(); j++) {
                firstChar.add(charList.get(i));
                secondChar.add(charList.get(j));
            }
        }

        List<String> stringList = new ArrayList<String>();

        for (int i = 0; i < firstChar.size(); i++) {
            String st = s.replaceAll("[^" + firstChar.get(i) + secondChar.get(i) + "]", "");
            stringList.add(st);
        }

        int consecutiveLength = 0;
        for (String st : stringList) {
            if(isConsecutive(st) && consecutiveLength < st.length()){
                
                
                consecutiveLength = st.length();
                System.out.println("");
                System.out.println(consecutiveLength);
                System.out.println(st);

            }
        
        }

        return consecutiveLength;

    }

    public static void main(String[] args) {

        String s = "uyetuppelecblwipdsqabzsvyfaezeqhpnalahnpkdbhzjglcuqfjnzpmbwprelbayyzovkhacgrglrdpmvaexkgertilnfooeazvulykxypsxicofnbyivkthovpjzhpohdhuebazlukfhaavfsssuupbyjqdxwwqlicbjirirspqhxomjdzswtsogugmbnslcalcfaxqmionsxdgpkotffycphsewyqvhqcwlufekxwoiudxjixchfqlavjwhaennkmfsdhigyeifnoskjbzgzggsmshdhzagpznkbahixqgrdnmlzogprctjggsujmqzqknvcuvdinesbwpirfasnvfjqceyrkknyvdritcfyowsgfrevzon";
        int alternate = alternate(s);
        System.out.println(alternate);

    }
}