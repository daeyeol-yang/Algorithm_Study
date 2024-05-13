package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int [][]arr = new int[N+1][N+1];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=N ; j++) {
                if(i==j){
                    arr[i][j]=0;
                }else {
                    arr[i][j]=10000001;
                }
            }

        }

        for (int i = 0; i < M; i++) {
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if(arr[start][end]>cost){

                arr[start][end]=cost;
            }
        }

        for (int k = 1; k <=N ; k++) {
            for (int start = 1; start <=N ; start++) {
                for (int end = 1; end <=N ; end++) {
                    arr[start][end]= Math.min(arr[start][end],arr[start][k]+arr[k][end]);
                }
            }
        }

        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=N ; j++) {
                if(arr[i][j]==10000001){
                    arr[i][j]=0;
                }
                sb.append(arr[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);


    }
}
