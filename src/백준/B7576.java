package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B7576 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};


    static int[][] map;
    static int garo, sero;


    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        garo = Integer.parseInt(st.nextToken());
        sero = Integer.parseInt(st.nextToken());
        map = new int[sero][garo];
        queue = new LinkedList<>();

        for (int i = 0; i < sero; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < garo; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < sero; i++) {
            for (int j = 0; j < garo; j++) {
                if (map[i][j] == 1) {
                    queue.add(new int[] {j, i});
                }
            }
        }

        for (int i = 0; i < sero; i++) {
            for (int j = 0; j < garo; j++) {
                if (map[i][j] == 1) {
                    bfs(j, i);
                }
            }
        }

        int max = 0;
        boolean check = false;

        for (int i = 0; i < sero; i++) {
            for (int j = 0; j < garo; j++) {
                max = Math.max(map[i][j], max);
                if (map[i][j] == 0) {
                    check = true;
                }
            }
        }
        if (check) {
            System.out.println(-1);
        } else {

            System.out.println(max - 1);
        }
    }

    static void bfs(int x, int y) {

        queue.offer(new int[] {x, y});


        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int next_x = now[0] + dx[i];
                int next_y = now[1] + dy[i];
                if (next_x < 0 || next_y < 0 || next_x >= garo || next_y >= sero) {
                    continue;
                }

                if (map[next_y][next_x] == 0) {

                    map[next_y][next_x] = map[now[1]][now[0]] + 1;
                    queue.add(new int[] {next_x, next_y});
                }

            }
        }

    }
}
