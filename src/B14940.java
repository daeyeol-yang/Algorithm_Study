import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B14940 {

    static int []dx = {0,0,1,-1};
    static int []dy = {1,-1,0,0};

    static int M;
    static int N;

    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        int start_x =0;
        int start_y =0;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    start_x=j;
                    start_y=i;
                }
            }
        }

        bfs(start_x,start_y);


        for (int i = 0; i < N; i++) {
            for (int j = 0; j <M ; j++) {
                if(map[i][j]==1){
                    map[i][j]=-1;
                }else {
                    if(map[i][j]==0){
                        continue;
                    }
                    map[i][j]-=2;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");

        }

        System.out.println(sb);
    }

    public static void bfs(int x, int y){
        int []now = new int[2];
        now[0] = x;
        now[1] =y;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(now);

        while (!queue.isEmpty()) {
            now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int next_x = now[0] + dx[i];
                int next_y = now[1] + dy[i];
                if (next_x >= 0 && next_y >= 0 && next_x < M && next_y < N) {
                    if (map[next_y][next_x] == 1) {
                        map[next_y][next_x]= map[now[1]][now[0]]+1;
                        int[] next = new int[2];
                        next[0] = next_x;
                        next[1] = next_y;
                        queue.add(next);
                    }
                }
            }
        }


    }
}
