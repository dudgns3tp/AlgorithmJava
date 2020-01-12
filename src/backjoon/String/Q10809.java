package backjoon.String;
import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num;
        String input = sc.next();
        int [] result = new int[26];
        Arrays.fill(result,-1);

        for(int i=0; i<input.length(); i++){
            num = (int)input.charAt(i) - 97;
            if(result[num] == -1)
                result[num] = i;
        }
        for(int i:result){
            System.out.print(result[i]+" ");
        }
    }
}
