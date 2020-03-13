package String_And_Array;

import java.util.Stack;

public class DailyTemperature {
    public static void main(String []args){
        DailyTemperature a = new DailyTemperature();
        int nums[] = {73,74,75,71,69,72,76,73};

        int [] result = a.solve();
    }
    static int[] solve(int [] temper){
        //1
        Stack<Integer> s = new Stack<>();
        int []result = new int[temper.length];

        //2
        for(int i=0; i<temper.length; i++){
            while(s.isEmpty() && temper[s.peek()]< temper[i]){
                //1-0
                result[i-1] = s.pop();
            }
            s.push(i);

        }

        return result;
    }
}
