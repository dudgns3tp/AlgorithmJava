package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q10773_stack {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack s = new Stack<Integer>();
        int result=0;
        for(int i=0; i<k; i++){
            int temp = sc.nextInt();
            if(temp == 0){
                s.pop();
                continue;
            }
            s.push(temp);
        }

        while(!s.empty()){
            result += Integer.parseInt(String.valueOf(s.pop()));
        }

        System.out.println(result);
    }
}
