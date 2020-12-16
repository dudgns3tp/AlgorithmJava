package backjoon;

import java.util.Scanner;
import java.util.Vector;

public class Q2798 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < N; i++) {
            v.addElement(sc.nextInt());
        }

        int max = 0;
        for(int i = 0; i < N - 2; i++ ){
            for( int j = 1 ; j< N - 1; j++ ){
                for (int z = 2; z < N; z++ ) {
                    if( !(i == j) && !(i == z) && !(j == z) ){
                        int temp = v.elementAt(i) + v.elementAt(j) + v.elementAt(z);
                        if(temp > max && temp <= M){
                            max = temp;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
