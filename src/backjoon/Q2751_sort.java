package backjoon;

import java.util.Scanner;

public class Q2751_sort {
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[(start+end)/2];
        while(start<= end){
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end){
                int tmp = arr[start];
                arr[start] =arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
        }
        return start;
    }

    public static int [] quickSort(int [] array, int start, int end){
        int pivot = partition(array,start,end);
        if(start<pivot-1)
            quickSort(array,start,pivot-1);
        if(start<end)
            quickSort(array,pivot,end);
        return array;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[] = new int[N];
        for(int i = 0; i< N; i++){
            num[i] = sc.nextInt();
        }
        //시간초과 때문에 퀵소트 사용
        quickSort(num,0,num.length-1);
        for(int i = 0; i< N; i++){
            System.out.println(num[i]);
        }

    }
}