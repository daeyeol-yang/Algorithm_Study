package 백준;

import java.util.Scanner;

public class B15650 {

    static int N,D;

    static int []arr;
    static boolean []visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        D = sc.nextInt();

        arr = new int[D];
        visited = new boolean[N];

        solution(0,0);


    }

    static void solution(int x,int depth){
        if(D == depth){
            for(int n : arr){
                System.out.print(n+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]&&i+1>x){
                visited[i]=true;
                arr[depth]=i+1;
                solution(i+1,depth+1);
                visited[i]=false;
            }

        }
    }
}
