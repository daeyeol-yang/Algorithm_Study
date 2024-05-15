package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15649 {

    static boolean[] visited;

    static int[] arr;

    static int N;

    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr= new int[M];

        visited = new boolean[N];


            back(0);


    }

    static void back(int d){

        if(d==M){
            for(int k : arr){
                System.out.print(k+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <=N ; i++) {
            if(!visited[i-1]){
                arr[d]=i;
                visited[i-1]=true;
                back(d+1);
                visited[i-1]=false;
            }
        }

    }
}
