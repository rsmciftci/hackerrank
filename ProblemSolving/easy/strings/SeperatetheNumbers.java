package easy.strings;

import java.util.*;

public class SeperatetheNumbers {

    // https://www.hackerrank.com/challenges/separate-the-numbers/problem?isFullScreen=true
    // 1:08:00

    public static void separateNumbers(String str) {

        int maxDigit = str.length() / 2;
        int digit = 1;
        // initial numbers needs to be Long !!!
        List<Long> initialNumbers = new ArrayList<>();

        while (maxDigit >= digit && digit <= 19) {

            String firstString = str.substring(0, digit);

            Long firstLong = Long.parseLong(firstString);
            initialNumbers.add(firstLong);
            digit++;

        }

        for (int i = 0; i < initialNumbers.size(); i++) {

            String constStr = String.valueOf(initialNumbers.get(i));
            String currentStr = String.valueOf(initialNumbers.get(i));
            Long currentLong = initialNumbers.get(i);

            while (currentStr.length() < str.length()) {
                currentLong += 1;
                currentStr += String.valueOf(currentLong);
            }

            if (currentStr.equals(str)) {
                System.out.println("YES " + constStr);
                return;
            }

        }
        System.out.println("NO");

    }

    public static void main(String[] args) {

        String str = "90071992547409929007199254740993";
        separateNumbers(str);

    }

}
