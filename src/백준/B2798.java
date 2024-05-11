package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int card =Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int result =0;
        
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[card];
        for (int i = 0; i < card; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i = 0; i < card-2; i++) {
            for (int j = i+1; j < card-1; j++) {
                for (int k = j+1; k < card; k++) {
                    int temp = arr[i]+arr[j]+arr[k];
                    if(temp>count){
                        continue;
                    }
                    if(result<temp&&temp<=count){
                        result=temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
