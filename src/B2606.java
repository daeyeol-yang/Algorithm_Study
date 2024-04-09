import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2606 {

    static ArrayList<Integer>[] arrayLists;
    static boolean visited[];
    static int N, M, V;
    static int count =0;

    public static int dfs(int i){
        visited[i] = true;
        for(int k : arrayLists[i]){
            if(visited[k] == false){
                count++;
                dfs(k);
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        V=1;

        arrayLists = new ArrayList[N+1];
        visited = new boolean[N+1];
        for (int i = 1; i <=N ; i++) {
            arrayLists[i] = new ArrayList<Integer>();
        }

        StringTokenizer st;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arrayLists[u].add(v);
            arrayLists[v].add(u);


        }
        System.out.println(dfs(V));
    }
}
