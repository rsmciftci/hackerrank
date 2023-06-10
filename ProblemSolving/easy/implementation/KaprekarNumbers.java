package easy.implementation;

public class KaprekarNumbers {

    public static boolean isKaprekar(int val){

        long square = (long) Math.pow(val, 2);      

        String squareString = String.valueOf(square);
        int length = squareString.length();
        String left = squareString.substring(0, length/2);
        String right = squareString.substring(length/2, length);

        int leftInt = left.isEmpty() ? 0 : Integer.valueOf(left);
        int rightInt = Integer.parseInt(right);

        if(val == (leftInt + rightInt)){
            return true;
        }

        return false;       

        
    }

    public static void kaprekarNumbers(int p, int q) {

        StringBuilder strBuilder = new StringBuilder();
        for(int i = p; i <= q; i++) {
            if(isKaprekar(i)){
                strBuilder.append(i + " ");
            }
        }
        String string = strBuilder.toString();
        String strToPrint = string.isEmpty() ? "INVALID RANGE" : string.toString();
        System.out.println(strToPrint);
    }

    public static void main(String[] args) {
        kaprekarNumbers(1,99999);     

        
    }
    
}
