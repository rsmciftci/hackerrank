package easy.implementation;

class StrangeCounter {

    // https://www.hackerrank.com/challenges/strange-code/problem?isFullScreen=true

    public static long strangeCounter(long t) {
        // Write your code here

        long curr = 3;
        while (t > curr) {
            t -= curr;
            curr *= 2;
        }
        return (curr-t+1);


    }

    public static void main(String[] args) {
            long t = 5L;
            System.out.println(strangeCounter(t));

    }
}