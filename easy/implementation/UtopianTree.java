package easy;

class UtopianTree {

    // https://www.hackerrank.com/challenges/utopian-tree/

    public static int utopianTree(int n) {

        int height = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                height = 2 * height;
            } else {
                height += 1;
            }
        }

        return height;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(5));

    }
}