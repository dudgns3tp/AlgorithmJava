package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q10845 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Queue queue = new LinkedList();
        int N =sc.nextInt();
        int pushInput = 0;
        for(int i=0; i<N; i++){
            String input = sc.next();
            switch (input){
                case "push" :
                    pushInput = sc.nextInt();
                    queue.offer(pushInput);
                    break;
                case "pop" :
                    System.out.println(queue.isEmpty()?-1:queue.poll());
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    System.out.println(queue.isEmpty()?1:0);
                    break;
                case "front" :
                    System.out.println(queue.isEmpty()?-1:queue.peek());
                    break;
                case "back" :
                    System.out.println(queue.isEmpty()?-1:pushInput);
                    break;
            }
        }
    }
}
