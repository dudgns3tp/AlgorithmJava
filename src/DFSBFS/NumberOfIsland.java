package DFSBFS;

import java.util.Queue;
import java.util.LinkedList;

public class NumberOfIsland {
    public static void main(String []args){
        char[][] grid= {
                {'1','1','1','0','1'},
                {'1','1','0','0','0'},
                {'1','1','0','0','1'},
                {'0','0','0','0','1'}
        };
        NumberOfIsland a = new NumberOfIsland();
        //System.out.println(a.solveDFS(grid));
        System.out.println(a.solveBFS(grid));
    }

    int [][] dirs= {{-1,0}, {1,0}, {0,1},{0,-1}};

    public int solveBFS(char[][] grid){
        System.out.println("----bfs----");
        //1. error
        if(grid.length==0|| grid == null|| grid[0].length==0) return 0;

        //2.
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]=='1') {
                    count++;

                    bfs(grid, i, j);
                }

            }
        }
        return count;
    }

    public int solveDFS(char[][] grid){
        print(grid);

        //1 error managing
        if(grid== null || grid.length == 0 || grid[0].length ==0) return 0;

        //2 00위치가 1인것 부터찾는다.
        int count =0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]=='1') {
                    count++;
                    dfs(grid, i, j);
                }

            }
        }
        System.out.println("=============after==============");
        print(grid);
        return count;
    }

    public void bfs(char[][] grid, int x, int y){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        while(!queue.isEmpty()){
            int size = queue.size();
            int[] point = queue.poll();
            for(int i = 0; i<size; i++){
                for(int[] dir: dirs){
                    int x1 = point[0] + dir[0];
                    int y1 = point[1] + dir[1];
                    if(x1>=0 && y1>=0 && x1<grid.length && y1<grid[0].length && grid[x1][y1] == '1'){
                        System.out.println("x1:"+x1+" y1:"+y1);
                        grid[x1][y1] = '0';
                        queue.offer(new int[] {x1,y1});
                    }
                }
            }
        }
    }
    public void dfs(char[][] grid,int i, int j){
        //System.out.println("i: "+i+" j "+j);
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] != '1') return;
        grid[i][j]='X';
        dfs(grid, i-1,j);
        dfs(grid, i+1,j);
        dfs(grid, i,j-1);
        dfs(grid, i,j+1);
    }

    public void print(char[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                //System.out.print("grid["+i+"]["+j+"]"+ grid[i][j]+" ");
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
