package easy.implementation;

import java.util.*;

// https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true

// 20:55

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {

        List<Integer> indexForXValue = new ArrayList<Integer>();

        for (int x = 1; x <= p.size(); x++) {
            indexForXValue.add((p.indexOf(x) + 1));
        }
        List<Integer> xInP = new ArrayList<Integer>();

        for (int i = 0; i < indexForXValue.size(); i++) {
            int valueToSearch = indexForXValue.get(i);
            int index = p.indexOf(valueToSearch);
            xInP.add(index+1);
            
            
        }

        return xInP;

    }

    public static void main(String[] args) {

        List<Integer> permutationEquation = permutationEquation(Arrays.asList(4, 3, 5, 1, 2));
        System.out.println(permutationEquation.toString());

    }
}
