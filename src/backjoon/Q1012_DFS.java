package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1012_DFS {
    static int dirs[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    static int M,N,K;
    static int [][]grid;
    static boolean [][]visit;
    public static void farm(int [][] grid){
        //1 처리해주기
        int count =0;

        for(int i =0; i<M; i++){
            for(int j=0; j<N; j++){
                if(grid[i][j]== 1 && visit[i][j] == false){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void dfs(int grid[][], int x , int y){
        if(x<0 || y<0 || x>=M || y>=N || visit[x][y]==true || grid[x][y]==0){
            return;
        }
        visit[x][y] = true;
        for(int [] dir:dirs){
            dfs(grid,x+dir[0],y+dir[1]);
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        int round = 1;
        while(round<=T){
            M=sc.nextInt();
            N=sc.nextInt();
            K=sc.nextInt();

            grid = new int[M][N];
            visit = new boolean[M][N];
            for(int i=0; i<M; i++) {
                Arrays.fill(grid[i], 0);
                Arrays.fill(visit[i], false);
            }
            for(int i=0; i<K; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                grid[a][b] = 1;
            }
            farm(grid);
            round++;
        }
    }
}
