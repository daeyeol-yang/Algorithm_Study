package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        st= new StringTokenizer(br.readLine());
        int min =0;
        int max =0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);

        }

        while (min<=max){
            int mid = (max+min)/2;

            long sum=0;
            int size =0;
            for (int i = 0; i < N; i++) {
                size=arr[i]-mid;
                if(size>=0){
                    sum+=size;
                }
            }

            if(sum>=M){
                min = mid + 1;
            }else{
                max = mid -1;
            }
        }

        System.out.println(max);
    }
}
