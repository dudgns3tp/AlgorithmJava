package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q11399_greedy {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int waitTime = 0;
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<N; i++){
             result+= arr[i];
            waitTime +=result;
        }
        System.out.println(waitTime);
    }
}
