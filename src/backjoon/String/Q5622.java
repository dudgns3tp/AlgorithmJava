package backjoon.String;
import java.util.Scanner;
public class Q5622 {
    private static int swtichNum(char c){
        int result=0;
       switch (c){
           case 'A':
           case 'B':
           case 'C':
               result =3;
               break;
           case 'D':
           case 'E':
           case 'F':
               result =4;
               break;
           case 'G':
           case 'H':
           case 'I':
               result = 5;
               break;
           case 'J':
           case 'K':
           case 'L':
               result = 6;
               break;
           case 'M':
           case 'N':
           case 'O':
               result = 7;
               break;
           case 'P':
           case 'Q':
           case 'R':
           case 'S':
               result = 8;
               break;
           case 'T':
           case 'U':
           case 'V':
               result = 9;
               break;
           case 'W':
           case 'X':
           case 'Y':
           case 'Z':
               result = 10;
               break;
       }
        return result;
    }

    private static int Dial(String str){
        int result=0;
        for(int i=0; i<str.length(); i++){
                result+=swtichNum(str.charAt(i));
        }
        return result;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        System.out.println(Dial(str));
    }
}
