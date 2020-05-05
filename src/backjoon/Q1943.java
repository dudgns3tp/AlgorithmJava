package backjoon;

import java.util.Scanner;

public class Q1943 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int LCM;

        int T = sc.nextInt();
        int cnt =1;
        while(cnt<=T){
            int r =1;
            int A = sc.nextInt();
            int B = sc.nextInt();
            int tmp1 =A, tmp2=B;
            if(A<B){
                A = tmp2;
                B = tmp1;
            }
            while(r>0){
                r = A % B;
                A = B;
                B = r;
            }
            LCM = tmp1* tmp2/A;//LCM(최소공배수)구하기
            System.out.println(LCM);
            cnt++;
        }

    }
}
