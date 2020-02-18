package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10815 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrN = new int[N];
        for(int i =0; i<N; i++){
            arrN[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int []arrM = new int[M];
        int []result = new int[M];
        for(int i=0; i<M; i++){
            arrM[i] = sc.nextInt();
            result[i] = 0;
        }
        Arrays.sort(arrN);

        for(int i=0; i<M; i++){
            boolean find = false;
            int target = arrM[i];
            int start =0;
            int end = N-1;
            int mid = (end + start) /2;
            while(end-start>=0){
                if(arrN[mid]==target){
                    //한번에 찾음
                    result[i] = 1;
                    find = true;
                    break;
                }else if(arrN[mid]<=target){
                    //target이 배열 오른쪽에 존재
                    start =mid+1;
                }else if(arrN[mid]>=target){
                    //target이 배열 왼쪽에 존재
                    end = mid - 1;
                }
                mid =(end+start)/2;
            }
            if(!find){
                result[i] = 0;
            }
        }
        for(int i=0; i<M; i++){
            System.out.print(result[i]+" ");
        }

    }
}
