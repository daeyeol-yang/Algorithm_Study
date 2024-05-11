package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B21735 {

    static int count;
    static int[] dx ={0,0,1,-1};
    static int[] dy={1,-1,0,0};

    static int M;
    static int N;

    static char[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            for (int j = 0; j < M; j++) {
                map[i][j]= s.charAt(j);
            }
        }

        int i_x = 0;
        int i_y = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]=='I'){
                    i_x=j;
                    i_y=i;
                }
            }
        }

        //dfs(i_x,i_y);
        bfs(i_x,i_y);

        if (count==0){
            System.out.println("TT");
        }else {
            System.out.println(count);
        }

    }

    static void dfs(int x, int y){
        visited[y][x]=true;
        for (int i = 0; i < 4; i++) {
            int next_x = x+dx[i];
            int next_y = y+dy[i];

            if(next_x>=0&&next_y>=0&&next_x<M&&next_y<N&&!visited[next_y][next_x]&&map[next_y][next_x]!='X'){

                if(map[next_y][next_x]=='P'){
                    count++;
                }
                dfs(next_x,next_y);
            }
        }

    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        int[] start = {x,y};
        queue.add(start);
        visited[y][x]=true;
        while (!queue.isEmpty()){
            int []now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int next_x = now[0]+dx[i];
                int next_y = now[1]+ dy[i];
                if(next_x>=0&&next_y>=0&&next_x<M&&next_y<N&&!visited[next_y][next_x]&&map[next_y][next_x]!='X'){

                    if(map[next_y][next_x]=='P'){
                        count++;
                    }
                    int[] next = {next_x,next_y};
                    queue.add(next);
                    visited[next_y][next_x]=true;
                }
            }
        }
    }
}
