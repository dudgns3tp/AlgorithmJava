package dataStruture;

import java.util.Scanner;
import java.util.Stack;

public class Q10799 {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        for(int i= 0; i<N; i++){
            String lets = sc.next();
            switch (lets){
                case "push":
                    int x= sc.nextInt();
                    stack.push(x);
                    break;
                case "pop":
                    if(stack.empty()){
                        System.out.println(-1);
                    }else
                        System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.empty()){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                    break;
                case "top":
                    if(!(stack.empty())){
                        System.out.println(stack.peek());
                    }else{
                        System.out.println("-1");
                    }
                    break;
            }
        }

    }
}
