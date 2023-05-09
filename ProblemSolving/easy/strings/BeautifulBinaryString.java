package easy.strings;

public class BeautifulBinaryString {


    // https://www.hackerrank.com/challenges/beautiful-binary-string/problem?h_r=next-challenge&h_v=zen&isFullScreen=false


    public static int beautifulBinaryString(String b) {
        // Write your code here
        int switches = 0;
            
            for(int i = 0; i < b.length()-2; i++)
            {
                if(b.charAt(i) == '0' && b.charAt(i+1) == '1' && b.charAt(i+2) == '0')
                {
                    switches++;
                    i += 2;
                }
            }
            
            return switches;
    
        }


    public static void main(String[] args) {
        String test = "0100101010";

        System.out.println(beautifulBinaryString(test));

    }
}
