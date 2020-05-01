`package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10026_DFS {
    static int N;
    static char grid[][];
    static boolean visit[][];
    static int dirs[][] = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public static void solution(char [][] grid){
        int count=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                char target = grid[i][j];
                if(target == grid[i][j] && visit[i][j]==false){
                    dfs(grid, i, j,target);
                    count++;
                }
            }
        }
        System.out.print(count+" ");

        for(int i=0; i<N; i++){
            Arrays.fill(visit[i], false);
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(grid[i][j] =='G')
                    grid[i][j] ='R';
            }
        }

        count =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                char target = grid[i][j];
                if(target == grid[i][j] && visit[i][j]==false){
                    dfs(grid, i, j,target);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(char grid[][], int x, int y,char target){
        if(x<0 || y<0 || x>=N || y>=N || visit[x][y]==true || grid[x][y] != target){
            return;
        }
        visit[x][y] = true;
        for(int [] dir: dirs){
            dfs(grid,x+dir[0],y+dir[1],target);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        grid = new char [N][N];
        visit = new boolean[N][N];
        for(int i=0; i<N; i++){
            String input = sc.next();
            for(int j=0; j<N; j++){
                grid[i][j] = input.charAt(j);
            }
        }

        for(int i=0; i<N; i++){
            Arrays.fill(visit[i], false);
        }
        solution(grid);

    }
}
