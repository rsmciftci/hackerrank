package easy.implementation;

public class SherlockAndSquares {

    // https://www.hackerrank.com/challenges/sherlock-and-squares/problem?h_r=next-challenge&h_v=zen&isFullScreen=false
    

    public static int squares(int a, int b) {

        // Write your code here
        int aRoot = (int) Math.ceil(Math.sqrt(a));
        int bRoot = (int) Math.floor(Math.sqrt(b));
        return bRoot - aRoot +1;
        

    }

    public static void main(String[] args) {


       System.out.println(squares(24, 26));

    }
}
