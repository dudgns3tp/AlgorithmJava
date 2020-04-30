package backjoon;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Q2667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v =new Vector<Integer>();
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0; i<N; i++){
            String input = sc.next();
            for(int j=0; j<N; j++){
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
        Q2667 a = new Q2667();
        a.solve(arr, v);
    }
    public void solve(int arr[][], Vector<Integer> v){
        cntHouse(arr, v);
        System.out.println("사이즈는: "+ v.size());
        for(int i=0; i<v.size(); i++){
            System.out.println(v.elementAt(i));
        }
    }

    int [][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    int m;
    public void cntHouse(int[][] arr, Vector<Integer> v) {
        // null 체크
        if (arr == null || arr.length == 0) {
            return;
        }
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <m; j++) {
                if (arr[i][j] == 1) {
                    int area = dfs(arr, i, j, 0);
                    if(area != 0)
                        v.addElement(area);
                }
            }
        }
        Collections.sort(v);
    }

    int dfs(int[][] arr, int x, int y, int area) {
        if(x<0 || x>=m || y<0 || y>=m || arr[x][y]== 0){
            return area;
        }
        //탐색 가능할경우
        arr[x][y] =0;
        area++;
        System.out.println(area);
        for(int[] dir: dirs){
            area = dfs(arr, x+dir[0], y+dir[1], area);
        }
        return area;
    }
}