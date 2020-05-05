package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1300_binarySearch {
    static int [][]arr;
    static int []B;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int num = 1;
        arr = new int[N][N];
        B = new int[N*N];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                arr[i][j] = i*j;
                B[num++] = arr[i][j];
            }
        }
        Arrays.sort(B);
        System.out.println(B[k]);
    }
}
