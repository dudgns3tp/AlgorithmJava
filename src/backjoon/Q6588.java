package backjoon;

import java.util.*;

public class Q6588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 1000000;
        boolean [] prime = new boolean[N+1];
        List<Integer> list = new ArrayList<>();

        Arrays.fill(prime, true);

        for(int i=3; i*i <= N; i+=2) {
            if(prime[i])
                for(int j=i*i; j<=N; j+=i)
                    prime[j] = false;
        }
        for(int i=3; i<=N; i+=2)
            if(prime[i])
                list.add(i);

        while(true) {
            int n = sc.nextInt();
            boolean result = true;
            if(n==0)
                break;
            for(int i=0; i<list.size(); i++)
                if(prime[n-list.get(i)]) {
                    System.out.println(n+ " = " + list.get(i) +" + " + (n-list.get(i)));
                    result = false;
                    break;
                }
            if(result)
                System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}
