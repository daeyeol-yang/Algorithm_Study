package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[T][2];
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int rank;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            rank=1;
            for (int j = 0; j < T; j++) {
                if(i==j)continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] <arr[j][1]) rank++;
            }
            sb.append(rank+" ");
        }
        System.out.println(sb);


    }
}
