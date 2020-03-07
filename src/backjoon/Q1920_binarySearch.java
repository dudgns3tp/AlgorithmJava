package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1920_binarySearch {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int []B =new int[M];
        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
        }
        int []result = new int[M];
        // 이분탐색을 위한 정렬 1 2 3 4 5 6 7 8 9
        Arrays.sort(A);
        //탐색 시작
        for(int i=0; i<M; i++){
            boolean find = false;
            int target = B[i]; //순서대로 찾기
            int start=0;
            int end=N-1;
            int mid = (end + start) / 2;
            while(end - start >= 0){
                if(A[mid] == target){//한번에 찾았을때
                    result[i]=1;
                    find = true;
                    break;
                }
                else if(A[mid]<= target){
                    //target이 배열 오른쪽에 존재할때
                    start = mid+1;
                }
                else if(A[mid]>= target){
                    //target이 배열 왼쪽에 있을때
                    end = mid - 1;
                }
                mid = (start + end) /2;
            }
            if(!find){
                result[i] = 0;
            }
        }
        for(int i=0; i<M; i++){
            System.out.println(result[i]);
        }
    }
}
