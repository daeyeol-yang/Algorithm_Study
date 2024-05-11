package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        N = 1000 -N;
        int [] arr = {500,100,50,10,5,1};
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            count+=N/arr[i];
            N%=arr[i];

        }
        System.out.println(count);

    }
}
