package backjoon;

import java.util.Scanner;

public class Q15683_BP {
    static final int INF = 9999999;
    static int N, M;
    static int[][]Map = new int[8][8];
    static int CamCnt;
    static int[] CamType = new int[8];
    static int[] CamRow = new int[8];
    static int[] CamCol = new int[8];
    static int[] Dr = {0,-1,0,1};  // 0= 오른쪽 ,1 =위, 2=왼쪽, 3=아래
    static int[] Dc = {1,0,-1,0};
    static int[][] Dcam = {
            {1,0,0,0,4}, // 4가지를 생성가능
            {1,0,1,0,2}, // 2가지 생성 가능
            {1,1,0,0,4}, // 4가지 생성
            {1,1,1,0,4},
            {1,1,1,1,1}
    };

    static void watch(int r, int c, int dir){
        int srow = r, scol = c;
        for(;;){
            int nr = srow + Dr[dir], nc = scol + Dc[dir];
            if(nr<0 || nr > N-1 | nc <0 || nc> M-1) return;
            if(Map[nr][nc] == 6) return;
            Map[nr][nc] = 7; // 감시 영역
            srow=nr;
            scol=nc;
        }
    }

    static void copymap(int[][] dst, int [][] src){
        for(int i=0; i<N; ++i)
            for(int j=0; j<M; ++j)
                dst[i][j] = src[i][j];
    }

    static int solve(int pos){
        if(pos == CamCnt) { //모든 카메라에 대해서 완탐끝
            int sum = 0;
            for(int i=0; i<N; ++i){
                for(int j=0; j<M; ++j){
                    if(Map[i][j] == 0)
                        ++sum;
                }
            }
            return sum;
        }
        int [][] backup = new int[8][8];
        int ret = INF;
        int type = CamType[pos] -1 ; //인덱스 0부터 쓰기
        for(int i=0; i<Dcam[type][4]; ++i){  //4번인덱스 자리에 방향 경우의수
            copymap(backup,Map);
            for(int j=0; j<4; ++j){
                if(Dcam[type][j] ==1){
                    watch(CamRow[pos],CamCol[pos],(i+j)%4);
                }
            }

            ret = Math.min(ret, solve(pos +1));
            copymap(Map,backup);
        }
        return ret;
    }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        CamCnt = 0;
        for(int i=0; i<N; ++i){
            for(int j=0; j<M; ++j){
                Map[i][j] = sc.nextInt();
                if(Map[i][j]>=1 && Map[i][j]<=5){
                    CamType[CamCnt] = Map[i][j];
                    CamRow[CamCnt] = i;
                    CamCol[CamCnt++] = j;
                }
            }
        }

        System.out.println(solve(0));;
    }
}
