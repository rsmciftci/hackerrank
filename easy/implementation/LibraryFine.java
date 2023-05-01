package easy.implementation;

// https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true

public class LibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here+
        // 2 due
        // 1 return
        if((y2 > y1) ||(y2 >= y1 && m2 > m1) || ( y2 >= y1 && m2 >= m1 && d2 >= d1) ){
            return 0;
        }

        if( y2 == y1 && m2 == m1 && d2 < d1){
            return 15* (d1-d2);
        }

        if(y2 == y1 && m2 < m1){
            return 500 * (m1 - m2);
        }
        
        return 10000;
    
    
    
    }

    public static void main(String[] args) {

        System.out.println(libraryFine(2,6,2014,5,7,2014));

    }
}
