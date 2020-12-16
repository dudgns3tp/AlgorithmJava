package backjoon;

import java.util.Scanner;

public class Q1065 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <=N; i++){
            cnt = hanSu(i, cnt);
        }
        System.out.println(cnt);
    }

    public static int hanSu(int N, int cnt){
        if(N<99){
            return ++cnt;
        }
        // 모든 숫자 같을때 예외처리
        int hanSuCount = 0;
        int gap = 0;
        boolean flag = true;
        String [] str = Integer.toString(N).split("");
        while(true){
            // flag 바뀌면 바로 탈
            if(!flag){
                break;
            }

            //반복문 다돌면 깨기 여기까지오면 성공
            if(hanSuCount == str.length -1) {
                ++cnt;
                break;
            }

            //한수 카운트 초기화
            if(hanSuCount == 0){
                gap = Integer.parseInt(str[0]) - Integer.parseInt(str[1]);
            }

            //갭이랑 차이 나는지 확인하기
            int thisGap = Integer.parseInt(str[hanSuCount]) - Integer.parseInt(str[hanSuCount + 1]);

            if(gap != thisGap){
                flag = false;
            }

            hanSuCount++;

        }

        return cnt;

    }
}
