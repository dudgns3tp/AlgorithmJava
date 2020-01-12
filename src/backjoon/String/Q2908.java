package backjoon.String;
import java.util.Scanner;

public class Q2908 {
    private static int make(String num){
        int len = num.length();

        String result = "";
        while(len !=0){
            result += num.substring(len-1,len);
            len --;
        }
        return Integer.parseInt(result);
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        int n1 = make(num1);
        int n2 = make(num2);
        if(n1>n2){
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }
    }
}
