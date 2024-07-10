package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class B1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][]arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j]= s.charAt(j)-'0';
            }
        }

        System.out.println((int)Math.pow(solution(arr,N,M)+1,2));





    }

    public static int solution(int[][]arr,int N,int M){
        int size = Math.min(N,M)-1;
        for (int i = size; i >=0; i--) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(isCheck(arr,i, j, k)){
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    public static boolean isCheck(int[][] arr , int size,int n, int m){
        if(n+size<arr.length&&m+size<arr[0].length){

            if(arr[n][m]==arr[n+size][m]&&arr[n][m]==arr[n][m+size]&&arr[n][m]==arr[n+size][m+size]){
                return true;
            }
            return false;
        }
        return false;
    }
}
