package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1931_greedy {
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] time = new int[N][2];
        int cnt = 0;
        int end = -1;
        for(int i=0; i<N; i++){
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) {
                if(start[1] == end[1]){
                    return Integer.compare(start[0],end[0]);
                }
                return Integer.compare(start[1],end[1]);
            }
        });
        for(int i = 0; i<N; i++){
            if(time[i][0]>=end){
                end=time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
