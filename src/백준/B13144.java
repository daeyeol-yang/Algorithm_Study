package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B13144 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N+1];
        for (int i = 1; i <=N ; i++) {
            arr[i]= Integer.parseInt(st.nextToken());

        }
        int [] arrCheck =new int[100000+1];

        long count =0;
        int start =1;
        int end =0;

        while (start<=N){
            while (end+1<=N && arrCheck[arr[end+1]]==0){
                end++;
                arrCheck[arr[end]]++;
            }

            count+= end-start+1;

            arrCheck[arr[start++]]--;


        }
        System.out.println(count);
    }
}
