package easy.implementation;

import java.util.*;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true

public class EqualizetheArray {

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();

        for (Integer val : arr) {
            boolean containsKey = result.containsKey(val);
            if (!containsKey) {
                result.put(val,1);
            } else {
                result.put(val, 1+ result.get(val));
            }
        }


        int manyTimes = 0;
        for(Integer val : result.values()){
            if(val > manyTimes){
                manyTimes = val;
            }
        }

        return arr.size() - manyTimes;

    }

    public static void main(String[] args) {

        List<Integer> asList = Arrays.asList(1,2,2,3);
        System.out.println(equalizeArray(asList));


    }
}
