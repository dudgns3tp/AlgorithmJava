package backjoon.String;

import java.util.Scanner;

public class Q1152 {
    public static void main(String []argv) {
        Scanner sc = new Scanner(System.in);
        int noWordCnt =0;

        String str = sc.nextLine();
        String[] word =str.split(" ");
        for(String wo:word){
            if(wo.length() == 0) {
                noWordCnt++;
            }
        }
        System.out.println(word.length - noWordCnt);
    }
}
