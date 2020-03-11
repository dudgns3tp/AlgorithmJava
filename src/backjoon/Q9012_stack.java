package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q9012_stack {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            Stack s = new Stack<Character>();
            String temp = sc.nextLine();
            String[] tempArray = temp.split("");
            for(int j=0; j<tempArray.length; j++) {
                if(tempArray.length == 1){
                    System.out.println("NO");
                    break;
                }

                if(tempArray[j].equals("(")) {
                    s.push(tempArray[j]);
                }
                else if(tempArray[j].equals(")") && s.empty()){
                    System.out.println("NO");
                    break;
                }
                else if(tempArray[j].equals(")")){
                    s.pop();
                }

                if(j==tempArray.length-1 && !(s.empty())){
                    System.out.println("YES");
                }
                else if(j==tempArray.length-1 && (s.empty())){
                    System.out.println("NO");
                }
            }
            s.clear();
        }
    }
}
