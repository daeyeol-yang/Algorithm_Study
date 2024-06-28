package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1049 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];
        int[] arr1 = new int[M];

        for (int i = 0; i < M; i++) {
            st= new StringTokenizer(br.readLine());
            arr[i]= Integer.parseInt(st.nextToken());
            arr1[i]= Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arr);
        Arrays.sort(arr1);


        int money =Math.min(Math.min((N/6+1)*arr[0],arr1[0]*N),N/6*arr[0]+N%6*arr1[0]);

        System.out.println(money);

    }
}
