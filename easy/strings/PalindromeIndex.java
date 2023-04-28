package easy.strings;
public class PalindromeIndex {

    // https://www.hackerrank.com/challenges/palindrome-index/problem?isFullScreen=true
    
    public static boolean isPalindrome(String s) {

        char[] charArray = s.toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {

            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }            
        }

        return true;

    }

    public static int palindromeIndex(String s) {

        if (isPalindrome(s)) {
            return -1;
        }

        for (int i = 0; i < s.length(); i++) {

            if (isPalindrome(s.substring(0, i) + s.substring(i + 1, s.length()))) {
                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println(palindromeIndex("hujh"));
    }

}
