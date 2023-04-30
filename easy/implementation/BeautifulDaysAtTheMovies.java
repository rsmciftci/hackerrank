package easy.implementation;

// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?h_r=next-challenge&h_v=zen&isFullScreen=false&h_r=next-challenge&h_v=zen

public class BeautifulDaysAtTheMovies {

    public static int reverse(int a){
        String str = String.valueOf(a);
        StringBuilder strBuilder = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            strBuilder.append(str.charAt(i));
        }
        String reversedString = strBuilder.toString();

        return Integer.parseInt(reversedString);

    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int beautifulDays = 0;
        for(int z = i; z <= j; z++){
            int diff = Math.abs(z - reverse(z));
            if(diff % k == 0){
                beautifulDays++;
            }

        }

       return beautifulDays;


    }

    public static void main(String[] args) {


        System.out.println(beautifulDays( 20,  23,  6));

    }
}
