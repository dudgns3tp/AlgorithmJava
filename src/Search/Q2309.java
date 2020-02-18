package Search;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
    public static final int NUM = 9;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[NUM];
        int sum =0;
        for(int i=0; i<NUM; i++){
            a[i] = sc.nextInt();
            sum+= a[i];
        }

        Arrays.sort(a);
        for(int i =0; i<NUM-1; i++){
            for(int j=1; j<NUM; j++){
                if(sum -(a[i] + a[j]) == 100){
                    for(int k = 0; j <NUM; k++){
                        if(k==i || k == j)
                            continue;
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }

    }
}
