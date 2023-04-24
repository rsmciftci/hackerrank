package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CutTheSticks {

    // https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

    public static List<Integer> cutTheSticks(List<Integer> arr) {

        List<Integer> valuesToReturn = new ArrayList<Integer>();
        valuesToReturn.add(arr.size());

        int shortest = findShortest(arr);
        List<Integer> array = arr;
        

        while(true){

            array = returnTheList(array, shortest);
            shortest = findShortest(array);

            

            if(array.size() == 0){
                break;
            }
            
            valuesToReturn.add(array.size());





            


        }

        return valuesToReturn;

    }

    public static int findShortest(List<Integer> arr) {

        int shortestStick = 0;

        for (Integer val : arr) {
            if (shortestStick < 1) {
                shortestStick = val;
            } else {
                if (val < shortestStick) {
                    shortestStick = val;
                }
            }

        }

        return shortestStick;

    }

    public static List<Integer> returnTheList(List<Integer> arr, int shortest) {
        List<Integer> result = new ArrayList<Integer>();

        for (Integer val : arr) {
            if ((val - shortest) > 0) {
                result.add(val-shortest);
            }

        }

        return result;

    }

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(5,4,4,2,2,8);

        List<Integer> cutTheSticks = cutTheSticks(arr);

        for(Integer val : cutTheSticks) {
            System.out.println(val);

        }

    }
}