package easy.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class CircularArrayRotation {

    // https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        LinkedList<Integer> rotatedList = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        while (true) {
            rotatedList.add(0, a.get(a.size() - 1));
            for (int i = 0; i < a.size() - 1; i++) {
                rotatedList.add(i + 1, a.get(i));

            }
            break;
        }

        for (int j = 1; j < k; j++) {

            int tempLast = rotatedList.getLast();

            rotatedList.addFirst(tempLast);
            rotatedList.removeLast();

        }

        for(Integer val : queries){
            result.add(rotatedList.get(val));
        }
        
        return result;
    }

    public static void main(String[] args) {

        List<Integer> queries = new ArrayList<Integer>();
        int k = 2;
        List<Integer> a = Arrays.asList(1, 2, 3);

        System.out.println(circularArrayRotation(a, k, queries).toString());

    }
}