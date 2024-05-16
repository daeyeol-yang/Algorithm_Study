package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9663 {

    static int count;

    static int N;

    static boolean[][] visited;

    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N  = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        arr = new int[N];
        dfs(0);
        System.out.println(count);
    }

    static void dfs(int depth){

        if(depth == N){
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth]=i;
            if(isCheck(depth)){
                dfs(depth+1);
            }

        }


    }

    static boolean isCheck(int x){
        for (int i = 0; i < x; i++) {
            if(arr[i]==arr[x]){
                return false;
            }

            if(Math.abs(x-i)==Math.abs(arr[x]-arr[i])){
                return false;
            }
        }
        return true;

    }
}
