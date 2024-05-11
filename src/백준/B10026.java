package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10026 {

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static boolean[][] visited;
    static boolean[][] visited1;

    static char[][] map;

    static char[] color = {'R', 'G', 'B'};

    static char[] color1 = {'R', 'B'};

    static int N;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];
        visited1 = new boolean[N][N];
        String s;
        for (int i = 0; i < N; i++) {
            s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.toCharArray()[j];
            }
        }
        int count = 0;
        int count1 = 0;


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < color.length; k++) {
                    if (map[i][j] == color[k] && !visited[i][j]) {


                        dfs(j, i, color[k]);

                        count++;

                    }

                }


            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < color1.length; k++) {
                    if (map[i][j] == color1[k] && !visited1[i][j]) {
                        dfs1(j, i, color1[k]);

                        count1++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count).append(" ").append(count1);

        System.out.println(sb);


    }

    static void dfs(int x, int y, char color) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {

            int next_x = x + dx[i];
            int next_y = y + dy[i];

            if (next_x >= 0 && next_y >= 0 && next_x < N && next_y < N && !visited[next_y][next_x] &&
                    map[next_y][next_x] == color) {
                dfs(next_x, next_y, color);
            }
        }
    }

    static void dfs1(int x, int y, char color1) {
        visited1[y][x] = true;
        for (int i = 0; i < 4; i++) {

            int next_x = x + dx[i];
            int next_y = y + dy[i];

            if (next_x >= 0 && next_y >= 0 && next_x < N && next_y < N && !visited1[next_y][next_x] &&
                    map[next_y][next_x] == color1) {
                dfs1(next_x, next_y, color1);
            }

        }
    }
}
