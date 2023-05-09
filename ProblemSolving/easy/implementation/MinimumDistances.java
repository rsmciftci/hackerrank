package easy.implementation;

import java.util.*;

// https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true

public class MinimumDistances {

    public static int minimumDistances(List<Integer> a) {

        int minDist = 10000;

        for (int i = 0; i < a.size(); i++) {
        
            int indexDiff = a.lastIndexOf(a.get(i)) - a.indexOf(a.get(i));
            if(indexDiff > 0 && minDist > indexDiff){
                minDist = indexDiff;
            }
            
            
        
        }

        if(minDist == 10000){
            return -1;
        }
        return minDist;

    }

    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 2, 5);

        int indexOf = asList.indexOf(1);
        int last = asList.lastIndexOf(1);
        System.out.println(indexOf);
        System.out.println(last);

        System.out.println(minimumDistances(asList));

    }

}
