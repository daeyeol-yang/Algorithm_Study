package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }


        for (int i = -999; i <=999 ; i++) {
            for (int j = -999; j <=999 ; j++) {
                if(arr[0]*i+arr[1]*j==arr[2]) {
                    if (arr[3] * i + arr[4] * j == arr[5]) {
                        System.out.println(i + " " + j);
                    }
                }
            }

        }


    }
}
