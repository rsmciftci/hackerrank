package easy.implementation;

import java.util.*;

public class LisasWorkbook {

    // https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=true

    public static int workbook(int n, int k, List<Integer> arr) {

        int pageNumber = 0;
        int special = 0;

        // i chapter
        for (int i = 1; i <= n; i++) {
            
          // j number of question
            for (int j = 1; j <= arr.get(i-1); j++) {

                if(k == 1 && j%k == 0){ // for rare case, you can check by uncommenting
                    pageNumber += 1;
                }

                if(j%k == 1){
                    pageNumber += 1;
                }

                if(j == pageNumber){
                    special++;
                }

                

            }

        }

        return special;

    }

    // special if pageNumber == questionNumber
    // each page holds k problems
    // ith chapter has got arr[i] problems
    // n number of chapters in the book

    public static void main(String[] args) {

        int n = 1;
        int k = 1;
        List<Integer> list = Arrays.asList(100);
        System.out.println(workbook(n, k, list));

    }

}
