package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563 {
    static boolean [][]array = new boolean[100][100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            solution(x,y);

        }
        int check=0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(array[i][j]){
                    check++;
                }
            }
        }
        System.out.println(check);

    }

    public static void solution(int x, int y){
        for (int i = y; i <y+10 ; i++) {
            for (int j = x; j <x+10 ; j++) {
                array[i][j]=true;
            }
        }
    }
}
