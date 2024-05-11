package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S6913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int testcase = 0; testcase < T; testcase++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][M];
            List<Integer> mylist = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int count=0;
                for (int j = 0; j < M; j++) {
                    arr[i][j]=Integer.parseInt(st.nextToken());
                    if(arr[i][j]==1){
                        count++;
                    }
                }
                mylist.add(count);
            }

            Collections.sort(mylist);

            int solution = mylist.get(mylist.size()-1);
            int solution1 =0;
            for (int i = 0; i < mylist.size(); i++) {
                if(solution==mylist.get(i)){
                    solution1++;
                }
            }

            sb.append("#").append(testcase).append(" ").append(solution1).append(" ").append(solution);


        }

        System.out.println(sb);
    }
}

