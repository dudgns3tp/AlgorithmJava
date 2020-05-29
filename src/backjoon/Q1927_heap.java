package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1927_heap {
    public static  class minHeap{
        private ArrayList<Integer> heap;

        //힙 생성자
        public minHeap(){
            heap = new ArrayList<>();
        }

        public  void insert(int val){
            heap.add(val);
            int p = heap.size() - 1;

            //힙 사이즈 -1이 1보다 작아질 때까지 진행
            while(p >1 && heap.get(p/2) > heap.get(p)){
                //부모보다 자식노드가 더 작으면 스왑
                int tmp = heap.get(p/2);
                heap.set(p/2, heap.get(p));
                heap.set(p,tmp);
                p = p/2;
            }
        }

        public int delete() {

            //힙 사이즈 -1이 1보다 작으면 0 리턴
            if(heap.size()-1 <1){
                return 0;
            }

            int deleteItem = heap.get(1);
            //root에 가장 마지막값을 넣고 마지막값 삭제
            heap.set(1,heap.get(heap.size() - 1));
            heap.remove(heap.size() -1);

            int pos = 1;
            while((pos*2) < heap.size()){
                int min  = heap.get(pos*2);
                int minPos = pos*2;

                if(((pos * 2 +1) < heap.size()) && min > heap.get(pos*2 +1)){
                    min = heap.get(pos*2 +1);
                    minPos = pos * 2 +1;
                }

                if(heap.get(pos) < min)
                    break;

                int tmp = heap.get(pos);
                heap.set(pos,heap.get(minPos));
                heap.set(minPos, tmp);
                pos=minPos;
            }
            return deleteItem;

        }
        public int heap_size(){
            return heap.size();

        }
    }
    public static void main(String []arg){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();

        minHeap heap = new minHeap();
        for(int i = 0; i< N; i++){
            int input = sc.nextInt();
            if(input == 0 && heap.heap_size() ==0){
                System.out.println(0);
            }
            if(input == 0 && heap.heap_size() >0){
                System.out.println(heap.delete());
            }else{
                heap.insert(input);
            }
        }
    }
}
