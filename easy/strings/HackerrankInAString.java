package easy.strings;

// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true
// 23:06
public class HackerrankInAString {

    // RETURN YES or NO
    public static String hackerrankInString(String s) {
        // Write your code here
        s.toLowerCase();

        char[] charArray = s.toCharArray();
        String result = "hackerrank";
        char[] resultArray = result.toCharArray();

        int count = 0;
        int currentIndex = -1;
        outer:
        for (int i = 0; i < result.length(); i++) {
            Character currentChToSearch = resultArray[i];
            
            
            for (int j = 0; j < charArray.length; j++) {
                Character crr = charArray[j];
                if( crr.equals(currentChToSearch) && j > currentIndex ) {
                    count++;
                    currentIndex = j;
                    continue outer;
                } 
                
            
            }

        }

        if(result.length() == count){
            return "YES";
        }

        return "NO";

    }

    public static void main(String[] args) {

        String test = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        System.out.println(hackerrankInString(test));

    }

}
