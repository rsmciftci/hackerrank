package easy.implementation;


public class RepeatedString {

    public static long calculateManyTimesInRemainder(String s, long remainder) {

        long manyTimesA = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < remainder; i++) {
            if (charArray[i] == 'a') {
                manyTimesA++;
            }
        }

        return manyTimesA;

    }

    public static long repeatedString(String s, long n) {
        // Write your code here

        if (s.length() < n) {

            long manyTimesA = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'a') {
                    manyTimesA++;
                }
            }
            long multiplier = n / s.length();
            long remainder = n % s.length();
            System.out.println("muptip * aInS : " + (manyTimesA * multiplier));
            System.out.println("remainder: " + remainder);
            System.out.println("many times in remainder : " + calculateManyTimesInRemainder(s, remainder));

            long total = (manyTimesA * multiplier) + (remainder * calculateManyTimesInRemainder(s, remainder));

            return total;

            // epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq

        }

        long total = calculateManyTimesInRemainder(s, n);
        return total;

    }

    public static void main(String[] args) {

        String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        long nnn = 549382313570L;

        System.out.println(repeatedString(s, nnn));

    }

}
