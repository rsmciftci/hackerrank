package easy.strings;

public class LoveLetterMystery {

    // https://www.hackerrank.com/challenges/the-love-letter-mystery/problem?isFullScreen=true

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        
        int numberOfOps = 0;
        for (int i = 0; i < s.length()/2; i++) {
            int left = s.charAt(i);
            int right = s.charAt(s.length()-i-1);
            
            if(left != right) {
                int diff = Math.abs(left - right);
                numberOfOps += diff;
            }
            
        
        }
        return numberOfOps;
    }

    public static void main(String[] args) {

        System.out.println(theLoveLetterMystery("abc"));
    }

}
