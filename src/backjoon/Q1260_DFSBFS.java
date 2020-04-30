package backjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1260_DFSBFS {
    static int n,v,m;
    static int map[][];
    /*
    * {{0,0,0,0,0},
    *  {0,0,1,1,1},
    *  {0,1,0,0,1},
    *  {0,1,0,0,1}.
    *  {0,1,1,1,0}}
    *
    * */
    static boolean[] visit;

    public static void dfs(int i){
        System.out.print(i+" ");
        //m번째 노드 방문 출력
        visit[i] = true;
        // 다음 노드로 가기.
        for(int j=1; j<n+1; j++){
            if(map[i][j]== 1 && visit[j]== false){
                dfs(j);
            }
        }
    }

    public static void bfs(int i){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(i);
        visit[i] = true;
        while(!queue.isEmpty()){
            int visitIndex = queue.poll();
            System.out.print(visitIndex+" ");
            //인접 노드들을 큐에 넣는다
            for(int j=1; j<n+1; j++){
                if(map[visitIndex][j]== 1 && visit[j] == false){
                    queue.offer(j);
                    visit[j] = true;
                }
            }
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();


        map = new int[n+1][n+1];
        visit = new boolean[n+1];
        // 방문 초기화
        Arrays.fill(visit,false);
        //모든 인행렬을 0으로 초기화
        for(int i=0; i<n+1; i++){
            Arrays.fill(map[i], 0);
        }
        //인접행렬 초기화
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(v);
        Arrays.fill(visit, false);
        System.out.println();
        bfs(v);

    }
}

