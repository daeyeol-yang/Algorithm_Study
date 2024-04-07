package DongBin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class D3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer [] arr = new Integer[T];
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        int result =0;
        Arrays.sort(arr);
        int check =0;
        int first = arr[T-1];
        int second = arr[T-2];

        for (int i = 0; i < M; i++) {

            if(K==check){
                result+=second;
                check=0;
                continue;
            }
            result+=first;
            check++;

        }
        System.out.println(result);


    }
}
