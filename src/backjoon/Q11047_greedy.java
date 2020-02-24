package backjoon;

import java.util.Scanner;
import java.util.Vector;

public class Q11047_greedy {
    public static void main(String []args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K= sc.nextInt();
        int cnt =0;
        Vector<Integer> A = new Vector<Integer>();

        for(int i=0; i<N; i++){
            A.addElement(sc.nextInt());
        }

        while(K!=0){
            for(int i=A.size()-1; i>0; i--){
                if(K-A.elementAt(i)>=0){
                    K-=A.elementAt(i);
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
