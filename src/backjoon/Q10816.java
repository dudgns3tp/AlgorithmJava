package backjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Q10816 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int M= sc.nextInt();
        int []arr2 = new int[M];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i<M; i++){
            arr2[i] = sc.nextInt();
            map.put(arr2[i],0);
        }

        for(int i=0; i<N; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for(int i=0; i<M; i++){
            System.out.print(map.get(arr2[i])+" ");
        }
    }
}
