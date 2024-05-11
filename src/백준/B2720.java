package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [] arr = new int[4];
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[0] = n/25;
            n %=25;
            arr[1] = n/10;
            n %= 10;
            arr[2] = n/5;
            n%= 5;
            arr[3] = n;

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();


        }


    }
}
