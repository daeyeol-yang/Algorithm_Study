package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int stair = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());
            int [][]arr = new int[stair+1][ho+1];


            for (int j = 1; j <= ho; j++) {
                arr[0][j] =j;
            }

            for (int j = 1; j <=stair; j++) {
                for (int k = 1; k <=ho ; k++) {
                    arr[j][k] = arr[j][k-1]+arr[j-1][k];
                }
            }

            System.out.println(arr[stair][ho]);

        }


    }
}
