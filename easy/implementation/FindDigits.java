package easy.implementation;

import java.util.ArrayList;
import java.util.List;

class FindDigits {

    // https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true

    public static int findDigits(int n) {

        List<Integer> digits = new ArrayList<Integer>();
        int theNumber = n;
        int divisor = 1_000_000_000;

        while (divisor > 0) {
            int result = theNumber / divisor;
            if (result > 0) {
                digits.add(result);
                theNumber = theNumber - result * divisor;
                divisor = divisor / 10;
            } else {
                divisor = divisor / 10;
            }

        }

        int count = 0;

        for (Integer val : digits) {
            if (n % val == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int findDigits = findDigits(1012);
        System.out.println(findDigits);
    }
}