package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb  = br.readLine();
        String sb1  = br.readLine();

       int[] arr = new int[26];



        int count =0;
        for (int i = 0; i < sb.length(); i++) {
                arr[sb.charAt(i)-'a']++;

        }

        for (int i = 0; i < sb1.length(); i++) {

                arr[sb1.charAt(i)-'a']--;


        }

        for (int i = 0; i < 26; i++) {
            count+=Math.abs(arr[i]);
        }


        System.out.println(count);
    }
}
