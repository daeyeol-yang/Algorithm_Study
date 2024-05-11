package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class XYZ {
    int x;

    int y;

    int z;

    public XYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}


public class B7569 {

    static int x;

    static int y;

    static int z;

    static int[][][] map;

    static int[] dx = {0, 0, 0, 0, 1, -1};

    static int[] dy = {0, 0, 1, -1, 0, 0};

    static int[] dz = {1, -1, 0, 0, 0, 0};

    static Queue<XYZ> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());

        map = new int[y][x][z];

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < x; k++) {
                    map[j][k][i] = Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    if (map[j][k][i] == 1) {
                        queue.add(new XYZ(k, j, i));
                    }
                }
            }
        }

        System.out.println(bfs());


    }

    public static int bfs() {
        while (!queue.isEmpty()) {
            XYZ xyz = queue.poll();
            int z1 = xyz.z;
            int y1 = xyz.y;
            int x1 = xyz.x;

            for (int i = 0; i < 6; i++) {
                int next_x = x1 + dx[i];
                int next_y = y1 + dy[i];
                int next_z = z1 + dz[i];

                if (next_x >= 0 && next_y >= 0 && next_z >= 0 && next_x < x && next_y < y && next_z < z) {
                    if (map[next_y][next_x][next_z] == 0) {
                        map[next_y][next_x][next_z] = map[y1][x1][z1] + 1;
                        queue.add(new XYZ(next_x, next_y, next_z));
                    }
                }

            }


        }

        int max = 0;


        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    max = Math.max(map[j][k][i], max);
                    if (map[j][k][i] == 0) {
                        return -1;
                    }
                }
            }
        }
        return max-1;


    }
}


