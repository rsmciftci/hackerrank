package easy.implementation;

import java.util.*;
// https://www.hackerrank.com/challenges/fair-rations/problem?isFullScreen=true

public class FairRations {

    

    public static String fairRations(List<Integer> B) {
        
        int nOfOdds = 0;
        for (Integer i : B) {
            if(i % 2 == 1){
                nOfOdds++;
            }
        
        }
        if(nOfOdds % 2 == 1){
            return "NO";
        }

        int countLoaves = 0;
        for(int i = 1; i < B.size()-1; i++){

            if(i == 1 && B.get(i) % 2 == 0 && B.get(i-1) % 2 == 1){
                B.set(i-1, 1+B.get(i-1));
                B.set(i, 1+B.get(i));
                countLoaves += 2;

            } 

            if(B.get(i) % 2 == 1){
             
                B.set(i, 1+B.get(i));
                if(B.get(i-1) % 2 == 1){
                    B.set(i-1, 1+B.get(i-1));
                }else{
                    B.set(i+1, 1+B.get(i+1));
                }
                countLoaves += 2;

            }

            
        }

        return String.valueOf(countLoaves);
        

    }

    public static void main(String[] args) {

        List<Integer> asList = Arrays.asList(3, 8, 4 ,6 ,1, 8);

        System.out.println(fairRations(asList));

    }
}
