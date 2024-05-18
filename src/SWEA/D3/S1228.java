package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S1228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <=T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            int N = Integer.parseInt(br.readLine());
            List<String> mylist = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                mylist.add(st.nextToken());
            }

            int problem = Integer.parseInt(br.readLine());
            st= new StringTokenizer(br.readLine());
            for (int i = 0; i < problem; i++) {
                st.nextToken();
                int x= Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());

                for (int j = 0; j < num; j++) {
                    mylist.add(x+j, st.nextToken());
                }
            }

            for (int i = 0; i < mylist.size(); i++) {
                sb.append(mylist.get(i)).append(" ");
            }
            sb.append('\n');

        }
        System.out.println(sb);

    }
}
