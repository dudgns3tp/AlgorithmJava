package backjoon.String;

import java.util.Arrays;
import java.util.Scanner;
public class Q1157 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str =sc.next().toLowerCase();
        int result[] =new int[26];
        Arrays.fill(result, 0);
        boolean sameFlag =false;
        int max =0;

        for(int i=0; i<str.length(); i++){
            result[str.charAt(i)-97]++;
        }

        for(int i=0; i<26; i++){
            if(result[i] > max){
                sameFlag = false;
                max = result[i];
            }else if(result[i] == max){
                sameFlag =true;
            }
        }

        if(sameFlag){
            System.out.println("?");
        }else{
            for(int i = 0; i<26; i++){
                if(result[i] == max){
                    System.out.println((char)(i+65));
                }
            }
        }
    }
}
