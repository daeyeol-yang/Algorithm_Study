package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B2468 {

    static int N;

    static int [][] map;
    static boolean [][] visit;

    static int count=0;

    static int [] dx = {0,0,1,-1};

    static int [] dy = {1,-1,0,0};





    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N  = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        visit = new boolean[N][N];

        int max =0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]>max){
                    max=map[i][j];
                }
            }
        }
        List<Integer> myList = new ArrayList<>();

        for (int rain = 0; rain <=max ; rain++) {


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visit[i][j]&&map[i][j]>rain) {
                        dfs(j, i, rain);
                        count++;
                    }
                }
            }
            myList.add(count);
            visit= new boolean[N][N];
            count=0;


        }
        Collections.sort(myList);
        System.out.println(myList.get(myList.size()-1));



    }

    static void dfs ( int x , int y , int rain){
        visit[y][x]=true;
        for (int i = 0; i < 4; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];
            if(next_x>=0 && next_y>=0 && next_x<N && next_y<N && !visit[next_y][next_x] && map[next_y][next_x]>rain){
                dfs(next_x,next_y ,rain);
            }
        }
    }
}
