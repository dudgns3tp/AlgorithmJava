package backjoon;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

class Queue<T>{

    class Node<T>{
        private T data;
        private Node<T> next; // 다음 노드

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void add(T item){
        Node<T> t = new Node<T>(item);

        if(last != null){
            last.next =t;
        }
        last = t;
        if(first == null){
            first = last;
        }
    }

    public T remove(){
        if(first ==null){
            throw new NoSuchElementException();
        }
        T data = first.data;
        first = first.next;
        if(first == null){
            last = null;
        }
        return data;
    }

    public T peek(){
        if(first ==null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }
}

class Graph{
    class Node{
        int data;
        LinkedList<Node> adjacent; // 인접한 노드의 관계
        boolean marked; //방문여부
        Node (int data){ //노드의 생성자.
            this.data = data; // 데이터 받고
            this.marked = false; // false 로 초기화
            adjacent = new LinkedList<Node>();
        }
    }
    Node[] nodes;
    Graph(int size){
        nodes = new Node[size];
        for(int i=0; i<size; i++){
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2){ // 두 노드의 관계를 저장하는 함수
        Node n1 = nodes[i1-1];
        Node n2 = nodes[i2-1];
        if(!n1.adjacent.contains(n2)){
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1);
        }
    }
    void dfs(){
        dfs(0);
    }

    void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()){
            Node r= stack.pop();
            for(Node n:r.adjacent){
                if(n.marked==false){
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void visit(Node n){
        System.out.print(n.data+1 + " ");
    }

    void bfs(){
        bfs(0);
    }

    void bfs(int index){
        Node root =nodes[index];
        Queue<Node> queue = new Queue<Node>();
        queue.add(root);
        root.marked = true;
        while(!queue.isEmpty()){
            Node r = queue.remove();
            for(Node n : r.adjacent){
                if(n.marked == false){
                    n.marked = true;
                    queue.add(n);
                }
            }
            visit(r);
        }
    }

    void dfsR(Node r){
        if(r == null) return;
        r.marked = true;
        visit(r);
        for(Node n : r.adjacent){
            if(n.marked == false){
                dfsR(n);
            }
        }
    }

    void dfsR(int index){
        Node r =nodes[index];
        dfsR(r);
    }

    void dfsR(){
        dfsR(0);
    }
}
public class Q1260 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        Graph g = new Graph(N);
        Graph g2 = new Graph(N);

        for(int i=0; i<M; i++){
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            g.addEdge(input1,input2);
            g2.addEdge(input1,input2);
        }
        g.dfs(V-1);
        System.out.println();
        g2.bfs(V-1);
    }
}
