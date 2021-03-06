package backjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q4963 {
    static int grid[][];
    static boolean visits[][];
    static int x, y;
    static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int result = 0;
            y = sc.nextInt();
            x = sc.nextInt();
            if (x == 0 && y == 0)
                break;

            grid = new int[x][y];
            visits = new boolean[x][y];
            for (int i = 0; i < visits.length; i++) {
                Arrays.fill(visits[i], false);
            }

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1 && visits[i][j] == false) {
                        result++;
                        //dfs(i, j, grid, visits);
                        bfs(i,j,grid,visits);
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void bfs(int w, int h, int [][] grid, boolean[][] visits){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[] {w,h});
        while(!queue.isEmpty()){
            int size = queue.size();
            int[] point = queue.poll();
            for(int i =0; i<size; i++){
                for(int[] dir: dirs){
                    int x1= point[0] +dir[0];
                    int y1 = point[1] + dir[1];
                    if(x1>=0 && y1>=0 && x1<grid.length && y1<grid[0].length && grid[x1][y1]==1 && !visits[x1][y1] ){
                        visits[x1][y1] = true;
                        queue.offer(new int[] {x1,y1});
                    }
                }
            }
        }
    }

    public static void dfs(int w, int h, int[][] grid, boolean[][] visits) {
        //1 예외체크
        int m = grid.length;
        int n = grid[0].length;
        if (w < 0 || h < 0 || w>=m ||  h>=n || visits[w][h] || grid[w][h] !=1 ) {
            return;
        }
        //방문 체크
        visits[w][h] = true;

        for (int[] dir : dirs) {
            dfs(w + dir[0], h + dir[1], grid, visits);
        }
    }
}
