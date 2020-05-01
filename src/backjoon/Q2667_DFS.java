package backjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Q2667_DFS {
    static int N ;
    static int grid[][];
    static int [][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    static boolean [][] visits;
    static Vector<Integer> vector = new Vector<Integer>();

    public static void connect(int [][] grid){
        //1 null check
        //if(N == 0)
          //  return 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(grid[i][j]==1 && visits[i][j]==false){
                    int area = dfs(grid,i,j,0);
                    vector.add(area);
                }
            }
        }
        System.out.println(vector.size());
        Collections.sort(vector);
        for(int i =0; i<vector.size(); i++){
            System.out.println(vector.elementAt(i));
        }
    }
    public static int dfs(int [][] grid, int x, int y, int area){
        //1. 거르기작업
        if(x<0 || y<0 || x>=N || y>=N || grid[x][y] == 0 || visits[x][y]== true){
            return area;
        }

        //안에 들어왔으면
        visits[x][y] = true;
        area++;
        for(int [] dir:dirs){
            area = dfs(grid,x+dir[0],y+dir[1],area);
        }
        return area;

    }
    public static void main(String []args){
           Scanner sc = new Scanner(System.in);
           N =sc.nextInt();

           grid = new int[N][N];
           visits = new boolean[N][N];
           for(int i=0; i<N; i++){
               String input = sc.next();
               for(int j=0; j<N; j++) {
                   grid[i][j] = input.charAt(j)-'0';
               }
           }
           for(int i=0; i<N; i++)
               Arrays.fill(visits[i],false);

           connect(grid);
    }
}
