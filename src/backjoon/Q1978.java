package backjoon;

import java.util.Scanner;

public class Q1978 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            boolean result = true;

            if(arr[i] == 1)
                result = false;
            for(int j=2; j<arr[i]; j++){
                if(arr[i]%j==0){
                    result =false;
                }
            }
            if(result)
                cnt++;
        }
        System.out.println(cnt);
    }

}
