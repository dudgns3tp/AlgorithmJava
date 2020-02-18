package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class BigNumber {
    public static void main(String []args){
        int [] numbers ={6,10,2};
        String answer = "";
        String strNumber[] = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            strNumber[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumber, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(strNumber[0].startsWith("0")) {
            answer += "0";
        } else {
            for(int j=0; j<strNumber.length; j++) {
                answer += strNumber[j];
            }
        }
        System.out.println(answer);


    }
}
