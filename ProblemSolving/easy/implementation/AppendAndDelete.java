package easy.implementation;

public class AppendAndDelete {

    // https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true

    public static String appendAndDelete(String s, String t, int k) {

        if (s.equals(t)) {
            return "Yes";
        }

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        int i = 0;

        while (i < t.length() && i < s.length()) {

            if (arrS[i] == arrT[i]) {
                i++;
            } else {
                break;
            }

        }

        int deleteOps = s.length() - i;
        int addOps = t.length() - i;
        int allOps = deleteOps + addOps;

        if (k < allOps) {
            return "No";
        }

        if (k >= s.length() + t.length()) {
            return "Yes";
        }

        if ((k - allOps) % 2 == 0) {
            return "Yes";
        }

        return "No";

    }

    public static void main(String[] args) {

        String s = "aaa";
        String t = "a";
        int k = 5;

        System.out.println(appendAndDelete(s, t, k));

    }

}
