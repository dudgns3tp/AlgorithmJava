package programmers;

import java.util.Arrays;

public class Knumber {
    public static void main(String []args){
        int array[] = {1,5,2,6,3,7,4};
        int commands[][] = {{2,5,3}, {4,4,1}, {1,7,3}};
        int answer[] = new int[3];
        for(int i=0; i<commands.length; i++){
            int cnt=0;
            int startIdx = commands[i][0];
            int endIdx = commands[i][1];
            int target = commands[i][2];
            int tmp[] = new int[endIdx-startIdx +1];
            for(int j=1; j<array.length+1; j++){
                if(j>=startIdx && j<=endIdx){
                    tmp[cnt++] =array[j-1];
                }
            }
            Arrays.sort(tmp);
            answer[i] = tmp[target-1];
        }
        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
