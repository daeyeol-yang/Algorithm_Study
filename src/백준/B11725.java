package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11725 {

    static boolean []visit;

    static ArrayList<Integer>[] mylist;

    static int []parent;

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        mylist = new ArrayList[N+1];
        parent = new int[N+1];
        visit = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            mylist[i]= new ArrayList<>();
        }

        for (int i = 0; i <N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second =Integer.parseInt(st.nextToken());
            mylist[first].add(second);
            mylist[second].add(first);
        }
        StringBuilder sb = new StringBuilder();

        dfs(1);

        for (int i = 2; i <=N ; i++) {
            sb.append(parent[i]).append('\n');
        }
        System.out.println(sb);
    }

    static void dfs(int n){
        visit[n]= true;
        for(int i: mylist[n]){
            if(!visit[i]){
                parent[i] =n;
                dfs(i);
            }
        }

    }
}
