package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B16928 {

    static int[] map;
    static int[][] sadariarr;
    static int[][] bamarr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sadari = Integer.parseInt(st.nextToken());
        int bam = Integer.parseInt(st.nextToken());
        sadariarr = new int [sadari][2];
        bamarr = new int [bam][2];

        for (int i = 0; i < sadari; i++) {
            st = new StringTokenizer(br.readLine());
            sadariarr[i][0] = Integer.parseInt(st.nextToken());
            sadariarr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < bam; i++) {
            st = new StringTokenizer(br.readLine());
            bamarr[i][0] = Integer.parseInt(st.nextToken());
            bamarr[i][1] = Integer.parseInt(st.nextToken());
        }

        map = new int[101];

        bfs();

        System.out.println(map[100]);
    }

    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        int start =1;
        map[start]=0;
        queue.add(start);
        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 1; i <= 6; i++) {

                int next = now + i;
                for (int j = 0; j <sadariarr.length; j++) {
                    if(next==sadariarr[j][0]){
                        next =sadariarr[j][1];
                    }
                }

                for (int j = 0; j < bamarr.length; j++) {
                    if(next==bamarr[j][0]){
                        next = bamarr[j][1];
                    }
                }
                if (next <= 100 && map[next] == 0){
                    map[next]= map[now]+1;
                    queue.add(next);
                }
            }
        }
    }
}
