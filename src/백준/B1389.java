package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][]arr = new int[N+1][N+1];
        int no = 100000000;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <=N ; j++) {
                if(i==j){
                    arr[i][j]=0;
                }else{
                    arr[i][j]=no;
                }
            }
        }

        for (int i = 1; i <= M; i++) {
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[start][end]=1;
            arr[end][start]=1;
        }

        for (int i = 1; i <=N ; i++) {
            for (int s = 1; s <=N ; s++) {
                for (int e = 1; e <=N ; e++) {
                    if(arr[s][e]>arr[s][i]+arr[i][e]){
                        arr[s][e] = arr[s][i]+arr[i][e];
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int answer=0;

        for (int i = 1; i <=N ; i++) {
            int sum=0;
            for (int j = 1; j <=N ; j++) {
                    sum+=arr[i][j];
            }

            if(sum<min){
                min=sum;
                answer=i;
            }
        }

        System.out.println(answer);


    }
}
