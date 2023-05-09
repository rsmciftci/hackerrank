package easy.implementation;
import java.util.Arrays;
import java.util.List;

class AngryProfessor {

    // https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        int earlyStudents = 0;

        for (Integer val : a) {
            if (val <= 0) {
                earlyStudents++;
            }
        }

        if(earlyStudents >= k) {
            return "NO";
        }
        return "YES";

    }

    public static void main(String[] args) {

        // int k: the threshold number of students

        List<Integer> arrivalTimes = Arrays.asList(-1, -3, 4, 2);

        int leastNumberOfStudentsNotToCancelLecture = 2;
        System.out.println(angryProfessor(leastNumberOfStudentsNotToCancelLecture, arrivalTimes));

    }
}