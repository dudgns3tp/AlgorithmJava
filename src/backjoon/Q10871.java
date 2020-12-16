package backjoon;

import java.util.Scanner;
import java.util.Vector;

public class Q10871 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int number;
        Vector<Integer> vector = new Vector<Integer>();
        for(int i = 0; i<N; i++){
            number = sc.nextInt();
            if(number < X){
                vector.add(number);
            }
        }
        for(int i=0; i<vector.size(); i++){
            System.out.print(vector.elementAt(i)+" ");
        }
    }
}
