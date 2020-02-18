package backjoon;
import java.util.*;

public class Q17143 {
    static class Shark{
        Shark(int s, int d, int z){
            this.s = s;
            this.d = d;
            this.z = z;
        }
        int s, d, z;
    }

    static int R, C, M;
    static Shark Arr[][] = new Shark[100][100];
    static int[] Dr ={-1, 1, 0, 0}; //델타 어레이 위 아래
    static int[] Dc = {0, 0, 1, -1}; //델타 어레이  오른쪽 왼쪽

    static int solve(){
        int sum = 0;
        Shark backup[][] = new Shark[100][100]; //원래 상어의 위치를 저장
        for(int t =0; t <C; ++t){ //1 초마다 한칸식 이동
            for(int i=0; i<R; ++i){ //i는행의 좌표
                if(Arr[i][t] != null){ //상어가 있는경우 낚시하기
                    sum+=Arr[i][t].z;
                    Arr[i][t] = null;
                    break;
                }
            }
            for(int i=0; i<R; ++i){
                for(int j=0; j<C; ++j){
                    backup[i][j] = Arr[i][j]; //현재있던 상어를 저장
                    Arr[i][j] = null; //최종적으로 상어가 이동한 정보
                }
            }

            // 상어 좌표 처리
            for(int i=0; i<R; ++i){
                for(int j=0; i<C; ++j){
                    Shark curr = backup[i][j];
                    if (curr != null){
                        int nr = i+curr.s * Dr[curr.d], nc = j+curr.s * Dc[curr.d]; //new row, column
                        if(nr<0){ //위로 이동하고 있었을떄 벗어나는경우
                            nr = -nr;
                            curr.d = 1; // 방향을 아래로 변경해줌
                        }

                        if(nr > R-1){ //아래로 이동하고 있을때
                            int a = nr / (R-1);
                            int b = nr % (R-1);
                            if(a%2 == 0){
                                nr = b;
                            } else{
                                nr = R-1 - b;
                                curr.d = 0;
                            }
                        }
                        if(nc < 0){
                            nc = -nc;
                            curr.d = 2;
                        }
                        if(nc > C-1){
                            int a =nc/(C-1);
                            int b = nc % (C-1);
                            if(a % 2 == 0){
                                nc = b;
                            }else{
                                nc = C-1 - b;
                                curr.d = 3;
                            }
                        }
                        if(Arr[nr][nc]== null || (Arr[nr][nc] != null && Arr[nr][nc].z < curr.z))
                            Arr[nr][nc] = curr;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        R =sc.nextInt(); //행의 크기
        C =sc.nextInt(); // 열의 크기
        M = sc.nextInt(); // 상어의 개수

        for(int i=0; i<M; ++i){
            int r= sc.nextInt() - 1;
            int c= sc.nextInt() - 1;
            int s= sc.nextInt();
            int d =sc.nextInt() -1;
            int z =sc.nextInt();

            Arr[r][c] = new Shark(s,d,z);
        }
        System.out.println(solve());
    }
}
