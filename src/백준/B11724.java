package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11724 {
    static ArrayList<Integer>[] A;
    static boolean  visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        visited = new boolean[node+1];
        A = new ArrayList[node+1];
        for (int i = 1; i <node+1; i++) {
            A[i]= new ArrayList<>();
        }
        for (int i = 0; i < edge ; i++) {
            st= new StringTokenizer(br.readLine());
            int node1= Integer.parseInt(st.nextToken());
            int node2= Integer.parseInt(st.nextToken());
            A[node1].add(node2);
            A[node2].add(node1);
        }

        int count =0;
        for (int i = 1; i < node+1 ; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v]=true;
        for(int i: A[v]){
            if(visited[i]==false){
                DFS(i);
            }
        }
    }
}
