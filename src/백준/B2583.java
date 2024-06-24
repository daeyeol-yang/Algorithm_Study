package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B2583 {

    public static boolean[][] visited;

    public static int[] dx = {0,0,-1,1};
    public static int[] dy = {1,-1,0,0};
    public static int N,M;
    public static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];

        int K = Integer.parseInt(st.nextToken());
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            int c =Integer.parseInt(st.nextToken());
            int d =Integer.parseInt(st.nextToken());

            for (int j = a; j <c ; j++) {
                for (int k = b; k <d ; k++) {

                    visited[N-1-k][j]=true;
                }

            }
        }


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(visited[i][j]==false){
                    count=0;
                    dfs(j,i);
                    list.add(count);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);



//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(visited[i][j]);
//            }
//            System.out.println();
//        }

    }

    public static void dfs(int x, int y){
        visited[y][x]=true;
        count++;
        for (int i = 0; i < 4; i++) {
            int next_x = x+dx[i];
            int next_y = y+dy[i];
            if(next_x>=0&&next_y>=0&&next_x<M&&next_y<N&&!visited[next_y][next_x]){
                dfs(next_x,next_y);
            }
        }
    }
}
