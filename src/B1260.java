import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {
    static boolean [] visited;
    static ArrayList<Integer>[] arrayLists;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node =Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startnode= Integer.parseInt(st.nextToken());
        arrayLists = new ArrayList[node+1];
        for (int i = 1; i <= node; i++) {
            arrayLists[i]= new ArrayList<>();

        }
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayLists[start].add(end);
            arrayLists[end].add(start);
        }

        for (int i = 1; i <=node ; i++) {
            Collections.sort(arrayLists[i]);
        }
        visited = new boolean[node+1];
        DFS(startnode);
        System.out.println();
        visited = new boolean[node+1];
        BFS(startnode);
        System.out.println();
    }

    private static void DFS(int startnode) {
        System.out.print(startnode+" ");
        visited[startnode]=true;
        for (int i : arrayLists[startnode]) {
            if(!visited[i]){
                DFS(i);
            }
        }
    }
    private static void BFS(int startnode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startnode);
        visited[startnode]=true;

        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now+" ");
            for(int i : arrayLists[now]){
                if(!visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
    }
}
