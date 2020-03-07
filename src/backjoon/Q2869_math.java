package backjoon;

import java.util.Scanner;

public class Q2869_math {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt(); int B= sc.nextInt(); int V= sc.nextInt();

        System.out.println(((V-B-1)/(A-B)) + 1);

    }
}
