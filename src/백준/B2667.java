package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B2667 {

    static int N;
    static int [][] map;

    static boolean [][] visit;

    static int []dx ={0,0,-1,1};

    static int []dy ={1,-1,0,0};

    static int count =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String s;
        map = new int[N][N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            s= br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j]= Integer.parseInt(String.valueOf(s.charAt(j)));

            }
        }//입력값들 받기


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==1&&!visit[i][j]){
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
            sb.append(list.get(i)).append('\n');
        }

        System.out.println(sb);


    }

    static void dfs(int x ,int y){
        visit[y][x]=true;
        count++;
        for (int i = 0; i < 4; i++) {
            int next_x = x+dx[i];
            int next_y = y+dy[i];
            if(next_x>=0 && next_y>=0 && next_x<N && next_y<N && !visit[next_y][next_x] && map[next_y][next_x] ==1){

                dfs(next_x,next_y);

            }
        }


    }
}
