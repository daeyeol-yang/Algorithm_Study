package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B1926 {

    public static int N,M;
    public static int[][] map;
    public static boolean[][] visited;
    
    public static int[] dx ={0,0,-1,1};
    public static int[] dy ={1,-1,0,0};

    public static int count =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st= new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                count=0;
                if(map[i][j]==1&&!visited[i][j]){
                    dfs(j,i);
                    myList.add(count);
                }
            }
        }

        Collections.sort(myList);
        int size = myList.size();
        System.out.println(size);
        if(size==0){

            System.out.println(0);
        }else{
            System.out.println(myList.get(size-1));

        }



    }

    public static void dfs(int x,int y){
        visited[y][x] =true;
        count++;
        for (int i = 0; i < 4; i++) {
            int next_x = x+dx[i];
            int next_y = y+dy[i];

            if(next_x>=0 && next_y >=0 && next_x<M && next_y<N && !visited[next_y][next_x] && map[next_y][next_x]!=0){
                dfs(next_x,next_y);
            }
        }
    }
}
