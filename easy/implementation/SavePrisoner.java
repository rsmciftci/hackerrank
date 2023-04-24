package easy;

class SavePrisoner {

    // https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int currentPrisoner = s;
        for (int i = 1; i < m; i++) {
            currentPrisoner++;
            
       
        }

        int prisonerToReturn = currentPrisoner%n;

        if(prisonerToReturn == 0){
            return n;
        }

        return prisonerToReturn;

    }

    public static void main(String[] args) {

        int n = 5;
        int m = 2;
        int s = 2;

        System.out.println(saveThePrisoner(n, m, s));

    }

}