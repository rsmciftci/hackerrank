package easy.implementation;

import java.util.*;

// https://www.hackerrank.com/challenges/queens-attack-2/problem?isFullScreen=true

public class QueensAttackII {

    public static boolean checkObstacle(int row, int column, HashSet<List<Integer>> obstacles) {

        List<Integer> currentNode = Arrays.asList(row, column);
        boolean contains = obstacles.contains(currentNode);
        return contains;

    }

    public static int upwardAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {

        int numberOfAttack = 0;

        for (int row = r_q + 1; row <= n; row++) {
            if (checkObstacle(row, c_q, obstacles)) {
                break;
            }
            numberOfAttack++;
        }
        return numberOfAttack;
    }

    public static int downwardAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {

        int numberOfAttack = 0;

        for (int row = r_q - 1; row >= 1; row--) {
            if (checkObstacle(row, c_q, obstacles)) {
                break;
            }
            numberOfAttack++;
        }
        return numberOfAttack;

    }

    public static int leftAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {

        int numberOfAttack = 0;

        for (int col = c_q - 1; col >= 1; col--) {
            if (checkObstacle(r_q, col, obstacles)) {
                break;
            }
            numberOfAttack++;
        }
        return numberOfAttack;

    }

    public static int rightAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {

        int numberOfAttack = 0;

        for (int col = c_q + 1; col <= n; col++) {
            if (checkObstacle(r_q, col, obstacles)) {
                break;
            }
            numberOfAttack++;
        }
        return numberOfAttack;
    }

    public static int rightUpAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {

        int colDiff = n - c_q;
        int rowDiff = n - r_q;

        int min = (colDiff < rowDiff) ? colDiff : rowDiff;
        int numberOfAttack = 0;
        for (int i = 0; i < min; i++) {

            if (checkObstacle(r_q + 1 + i, c_q + 1 + i, obstacles)) {
                break;
            }
            numberOfAttack++;

        }
        return numberOfAttack;

    }

    public static int leftUpAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {

        int colDiff = c_q - 1;
        int rowDiff = n - r_q;

        int min = (colDiff < rowDiff) ? colDiff : rowDiff;
        int numberOfAttack = 0;
        for (int i = 0; i < min; i++) {

            if (checkObstacle(r_q + 1 + i, c_q - 1 - i, obstacles)) {
                break;
            }
            numberOfAttack++;

        }
        return numberOfAttack;
    }

    public static int rightDownAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {

        int colDiff = n - c_q;
        int rowDiff = r_q - 1;

        int min = (colDiff < rowDiff) ? colDiff : rowDiff;
        int numberOfAttack = 0;
        for (int i = 0; i < min; i++) {

            if (checkObstacle(r_q - 1 - i, c_q + 1 + i, obstacles)) {
                break;
            }
            numberOfAttack++;

        }
        return numberOfAttack;
    }

    public static int leftDownAttack(int n, int r_q, int c_q, HashSet<List<Integer>> obstacles) {
        int colDiff = c_q - 1;
        int rowDiff = r_q - 1;

        int min = (colDiff < rowDiff) ? colDiff : rowDiff;
        int numberOfAttack = 0;
        for (int i = 0; i < min; i++) {

            if (checkObstacle(r_q - 1 - i, c_q - 1 - i, obstacles)) {
                break;
            }
            numberOfAttack++;

        }
        return numberOfAttack;

    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {

        HashSet<List<Integer>> obstaclesSet = new HashSet<>();
        obstaclesSet.addAll(obstacles);

        // Write your code here
        int upwardAttack = upwardAttack(n, r_q, c_q, obstaclesSet);
        int downwardAttack = downwardAttack(n, r_q, c_q, obstaclesSet);
        int leftAttack = leftAttack(n, r_q, c_q, obstaclesSet);
        int rightAttack = rightAttack(n, r_q, c_q, obstaclesSet);
        int rightUpAttack = rightUpAttack(n, r_q, c_q, obstaclesSet);
        int leftUpAttack = leftUpAttack(n, r_q, c_q, obstaclesSet);
        int rightDownAttack = rightDownAttack(n, r_q, c_q, obstaclesSet);
        int leftDownAttack = leftDownAttack(n, r_q, c_q, obstaclesSet);

        return upwardAttack + downwardAttack + leftAttack + rightAttack + rightUpAttack + leftUpAttack + rightDownAttack
                + leftDownAttack;

    }

    public static void main(String[] args) {
        List<Integer> obs1 = Arrays.asList(0, 0);
        List<Integer> obs2 = Arrays.asList(0, 0);
        List<Integer> obs3 = Arrays.asList(2, 2);
        List<List<Integer>> obstacles = Arrays.asList(obs1, obs2, obs3);
        List<Integer> test = Arrays.asList(0, 0);

        int r = 3;
        int c = 3;

        int n = 5;
        int k = obstacles.size();

        System.out.println(queensAttack(n, k, r, c, obstacles));
        System.out.println(obstacles.contains(test));

    }

}
