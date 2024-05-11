package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4936 {

    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
    static int[] dy = {1, -1, 0, 1, -1, 0, 1, -1};

    static int M;
    static int N;


    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visited = new boolean[N][M];

            if (M == 0 && N == 0) {
                break;
            }
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        DFS(j, i);
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

    public static void DFS(int x, int y) {
        visited[y][x] = true;
        for (int i = 0; i < 8; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];

            if (next_x >= 0 && next_y >= 0 && next_x < M && next_y < N && !visited[next_y][next_x] &&
                    map[next_y][next_x] == 1) {
                DFS(next_x, next_y);
            }

        }

    }
}
