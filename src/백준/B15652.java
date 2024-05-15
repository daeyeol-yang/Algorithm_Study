package 백준;

import java.util.Scanner;

public class B15652 {

    static int N,K;

    static int arr[];

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        arr = new int[K];

        solution(1,0);
        System.out.println(sb);
    }

    static void solution(int prev, int depth){
        if(depth==K){
            for(int n  : arr){

                sb.append(n).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if(i+1>=prev){
                arr[depth]= i+1;
                solution(i+1,depth+1);
            }
        }

    }
}
