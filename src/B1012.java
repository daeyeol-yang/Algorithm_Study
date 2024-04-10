import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1012 {

    static boolean[][] visited;
    static int count;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static int M;
    static int N;
    static int[][]arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            count=0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            visited=new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st= new StringTokenizer(br.readLine());
                int m = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());
                arr[n][m] = 1;
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(arr[j][k]==1 && !visited[j][k]){
                        dfs(j,k);
                        count++;
                    }
                }
                
            }
            System.out.println(count);
        }
    }

    public static void dfs(int x, int y){
        visited[y][x]=true;
        for (int i = 0; i < 4; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];
            if(next_x>=0 && next_y>=0 && next_x < M && next_y<N){
                if(arr[next_y][next_x] == 1 && !visited[next_y][next_x]){
                    dfs(next_x, next_y);
                }
            }
        }

    }
}
