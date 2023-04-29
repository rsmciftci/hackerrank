package easy.strings;

// https://www.hackerrank.com/challenges/alternating-characters/problem?isFullScreen=true
// 6:48


public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {

        int deletions = 0;
        char previousChar = 'Z';
        for(char ch : s.toCharArray()){
            if(previousChar == ch){
                deletions++;
            }

            previousChar = ch;

        }

        return deletions;

    }

    public static void main(String[] args) {

        System.out.println(alternatingCharacters("AAAA"));

    }

}
