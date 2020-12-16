package backjoon;

import java.util.Scanner;
import java.util.Vector;

public class Q2309 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[9];
        for(int i = 0; i < 9 ; i++) {
            array[i] = sc.nextInt();
        }
        for(int i =0; i<9 ; i++) {
            for (int j = 1; j < 9; j++){
                if(i != j) {
                    if(isFind(i, j, array)){
                        print(i, j, array);
                        return;
                    }
                }
            }
        }
    }

    public static boolean isFind(int idx1, int idx2, int [] array) {
        int i = 0;
        int sum = 0;
        while (i<9){
            if(i == idx1 || i == idx2) {
                i++;
                continue;
            }
            sum += array[i];
            i++;
        }
        return sum == 100;
    }

    public static void print(int idx1, int idx2, int [] array) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i = 0; i< array.length; i++){
            if( !(i==idx1 || i== idx2)){
                v.addElement(array[i]);
            }
        }
        v.sort(Integer::compareTo);
        for(int i =0; i<7 ; i++){
            System.out.println(v.elementAt(i));
        }
    }
}
