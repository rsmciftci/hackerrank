package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ManasaAndStones{

    // https://www.hackerrank.com/challenges/manasa-and-stones/

    public static List<Integer> stones(int n, int a, int b) {
        
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        
        int sum = a * (n-1);
        result.add(sum);
        set.add(sum);

        

        for(int i = 1; i < n; i++){
            int otherSums = 0;
            otherSums = sum - (a*i) + (b*i);

            boolean add = set.add(otherSums);
            if(add) result.add(otherSums);
        }
        Collections.sort(result);




        return result;
        
    }


    public static void main(String[] args) {
        int n = 2;
        int a = 1;
        int b = 1;

        System.out.println(stones(n,a,b).toString());
    }



}