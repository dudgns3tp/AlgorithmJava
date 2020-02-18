package backjoon;
import java.util.Scanner;
// stack으로 풀기
public class Q9935 {
    private static void boom(String str, String target){
        if(str.contains(target)){
            String cut = str.substring(0,str.indexOf(target)) + str.substring(str.indexOf(target)+target.length());
            boom(cut,target);
        }else{
            if(str.length() == 0){
                System.out.println("FRULA");
            }
            System.out.println(str);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tar = sc.next();
        boom(str,tar);
    }
}
