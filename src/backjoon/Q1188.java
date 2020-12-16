package backjoon;

import java.util.Scanner;
/*
* 1. 소세지를 받는다
* 2. 모든 소세지를 나열해서 사람 수 만큼 나눈다
*
*
* */

public class Q1188 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double M = sc.nextInt();
        int count = 0;
        double result = 0;
        System.out.println(cutting(N,M));
        double cuttingSausage = cutting(N,M);
        while(true){
            result += cuttingSausage;
            System.out.println(result);
            if(Math.round(result)>1){
                break;
            }
            count++;
        }
        System.out.println((int) count*N);
    }

    static double cutting(double sausage, double people){
        double result = sausage/people;
        if(sausage/people == 1){
            return 0;
        }
        return result;
    }
}
