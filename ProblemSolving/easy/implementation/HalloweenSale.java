package easy.implementation;

public class HalloweenSale {

    // https://www.hackerrank.com/challenges/halloween-sale/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    // int p: the price of the first game
    // int d: the discount from the previous game price
    // int m: the minimum cost of a game
    // int s: the starting budget


    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        if(p > s){
            return 0;
        }


        int moneySpent = 0;
        int multiplier = 1;


        while(true){

            int priceForCurrentGame = p - d * (multiplier - 1) > m ? p - d * (multiplier - 1) : m; 
            if((moneySpent + priceForCurrentGame ) <=  s){
                moneySpent += priceForCurrentGame;
                multiplier++;
            }else{
                return multiplier-1;             
            }

        }

    }

    public static void main(String[] args) {
        System.out.println(howManyGames(1,100,1,9777));

    }

}
