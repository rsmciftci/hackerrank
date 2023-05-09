package easy.implementation;

import java.util.*;

public class JumpingOnTheClouds {

    // https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int index = 0;
        int jump = -1;
        while (index < c.size()) {

            boolean canIncreaseBy2 = ((index + 2) < c.size()) && (c.get(index+2) == 0);
            if (canIncreaseBy2) {
                index+= 2;
                jump++;
            } else {
                index+= 1;
                jump++;
            }

        }
        return jump;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 0, 0, 1, 0, 0);
        System.out.println(jumpingOnClouds(list));

    }

}
