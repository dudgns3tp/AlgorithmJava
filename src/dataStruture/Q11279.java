package dataStruture;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q11279 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());

        while(N--> 0){
            int x = sc.nextInt();
            if(x==0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }else
                    System.out.println(queue.poll());
            }else
                queue.offer(x);
        }
    }
}
