package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B13023 {

    static ArrayList<Integer>[] arrayList;
    static boolean []visited;
    static boolean result=false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer( br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        arrayList = new ArrayList[node];
        visited= new boolean[node];
        for (int i = 0; i < node; i++) {
            arrayList[i]=new ArrayList<>();
        }
        for (int i = 0; i < edge; i++) {

            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt( st.nextToken());
            int end = Integer.parseInt( st.nextToken());
            arrayList[start].add(end);
            arrayList[end].add(start);
        }
        int count =0;
        for (int i = 0; i < node; i++) {
                DFS(i,count);
                if(result){
                    break;
                }

        }
        if(result){
            System.out.println(1);
        }else
        System.out.println(0);

    }

    private static void DFS(int i, int count) {
        if(count==5){
            result=true;
            return;
        }
        visited[i]=true;
        for (int j : arrayList[i]) {
            if(!visited[j]){
                DFS(j,count+1);
            }
        }
    }
}
