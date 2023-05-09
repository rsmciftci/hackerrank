package easy.implementation;

import java.util.*;

// https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true

public class HurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = 0;

        for (Integer val : height) {

            if (val > max) {
                max = val;
            }
        }

        if (max > k) {
            return max - k;
        }

        return 0;

    }

    public static void main(String[] args) {

    }
}
