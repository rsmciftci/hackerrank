package easy.strings;
class StrongPassword{

    // https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        

        int nOfCharacterNeeded = 0;

        boolean matchesWithNumber = password.matches("(.*)[0-9](.*)");
        boolean matchesWithUpperCase = password.matches("(.*)[A-Z](.*)");
        boolean matchesWithLowerCase = password.matches("(.*)[a-z](.*)");
        boolean matchesWithSpecialCharacters = password.matches("(.*)[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-](.*)");
        
        if(!matchesWithNumber) nOfCharacterNeeded++;
        if(!matchesWithUpperCase) nOfCharacterNeeded++;
        if(!matchesWithLowerCase) nOfCharacterNeeded++;
        if(!matchesWithSpecialCharacters) nOfCharacterNeeded++;

        if( n + nOfCharacterNeeded < 6){
            return 6-n;
        }



        return nOfCharacterNeeded;
    }

    public static void main(String[] args) {
        String password = "123456";
        int n = password.toCharArray().length;
        System.out.println(minimumNumber(n, password));

    }
}