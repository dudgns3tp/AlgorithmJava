package programmers;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/*
* long 받기
* 문자열 통쨰로 변환
* 잘라서 int Arraylist에 삽입
* 정렬
* 다시 문자열로 변경 후 붙혀서
* long으로 변환
* */

public class AL {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long> a = new ArrayList<>();
        String num = Long.toString(n);
        String Stmp;
        long ltmp;
        for(int i=0; i<num.length(); i++){
           Stmp= num.substring(i,i+1);
           ltmp =Long.parseLong(Stmp);
           a.add(ltmp);
        }
        Stmp = "";
        a.sort(Comparator.reverseOrder());
        for(long i:a){
            Stmp += Long.toString(i);
        }
        ltmp =Long.parseLong(Stmp);
        System.out.println(ltmp);


    }
}
