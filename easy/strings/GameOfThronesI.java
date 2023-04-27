package easy.strings;

import java.util.*;

class GameOfThronesI {

    // https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static String gameOfThrones(String s) {
        // Write your code here
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char ch : charArray){
            boolean containsKey = map.containsKey(ch);
            if(!containsKey){
                map.put(ch, 1);
            }else{
                map.put(ch,1+map.get(ch));
            }
        
        
        }

        int numberOfOdds = 0;

        for(Integer val : map.values()){
            if(val % 2 == 1){
                numberOfOdds++;
            }
            if(numberOfOdds > 1){
                return "NO";
            }
        }


        return "YES";
    
    
    }

    public static void main(String[] args) {

    }
}