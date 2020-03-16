//package backjoon;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//import java.util.Queue;
//
//public class Q2178_BFS {
//    static int [][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
//    static int count = 0;
//    public static void main(String []args){
//        //1. 입력
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        char [][]map = new char[N][M];
//
//        for(int i = 0; i < N; i++){
//            String str = sc.next();
//            char[] chars = str.toCharArray();
//            for(int j = 0; j < M; j++){
//                map[i][j] = chars[j] - '0';
//            }
//        }
//
//        //2. 예외처리
//
//        //3.풀이
//        bfs(map,0,0);
//        System.out.println(count);
//    }
//
//    static int bfs(String [][]map, int x, int y){
//        Queue<int[]> queue = new LinkedList<>();
//        queue.offer(new int[] {x,y});
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            int []point = queue.poll();
//            for(int i = 0; i<size; i++){
//                for(int[] dir: dirs){
//                    int x1 = point[0] + dir[0];
//                    int y1 = point[1] + dir[1];
//                    if(x1>=0 && y1>=0 && x1<map.length && y1<map[0].length && map[x1][y1] == "1"){
//                        count++;
//                        map[x1][y1] = "X";
//                        queue.offer(new int[] {x1,y1});
//                    }
//                }
//            }
//        }
//
//        return count;
//
//    }
//}
