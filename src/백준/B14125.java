package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B14125 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());


        }

        Arrays.sort(arr);

        if(arr[0]+arr[1]<=arr[2]){
            System.out.println(2*arr[0]+2*arr[1]-1);
        }else {
            System.out.println(arr[0]+arr[1]+arr[2]);
        }


    }
}
