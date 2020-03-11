package backjoon;

import java.util.Scanner;

public class kakaoCode_round1 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        int a[][] = new int[T][2];
        int result[] = new int[T];
        for(int i=0; i<T; i++){
            result[i] = 0;
        }
        for(int i=0; i<T; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        for(int i=0; i<T; i++){
            int festival1 = a[i][0];
            int festival2 = a[i][1];
            if(festival1 ==1){
                result[i] += 5000000;
            }
            else if(festival1>=2 && festival1 <=3)
                result[i] += 3000000;
            else if(festival1>=4 && festival1 <=6)
                result[i] += 2000000;
            else if(festival1>=7 && festival1 <=10)
                result[i] += 500000;
            else if(festival1>=11 && festival1 <=15)
                result[i] += 300000;
            else if(festival1>=16 && festival1 <=21)
                result[i] +=100000;

            if(festival2 ==1){
                result[i] += 5120000;
            }
            else if(festival2>=2 && festival2 <=3)
                result[i] += 2560000;
            else if(festival2>=4 && festival2 <=7)
                result[i] += 1280000;
            else if(festival2>=8 && festival2 <=15)
                result[i] += 640000;
            else if(festival2>=16 && festival2 <=31)
                result[i] += 320000;
        }

        for(int i=0; i<T; i++){
            System.out.println(result[i]);
        }


    }
}
